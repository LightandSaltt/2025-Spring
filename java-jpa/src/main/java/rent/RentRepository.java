package rent;

import jakarta.persistence.EntityGraph;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class RentRepository {
    public List<Rent> findAll(EntityManager em) {
        return em.createQuery("FROM Rent r", Rent.class).getResultList();
    }

    public List<Rent> findAllWithFetchJoin(EntityManager em) {
        String jpql = "SELECT r FROM Rent r"
            + " LEFT JOIN FETCH r.rentBooks rb"
            + " LEFT JOIN FETCH rb.book"
            + " LEFT JOIN FETCH r.member";

        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    public  List<Rent> findAllEntityGraph(EntityManager em) {
        EntityGraph<Rent> entityGraph = em.createEntityGraph(Rent.class);
        entityGraph.addAttributeNodes("rentBooks", "member");
        entityGraph.addSubgraph("rentBooks").addAttributeNodes("book"); // sub graph 추가

        Query query = em.createQuery("from Rent")
                            .setHint("jakarta.persistence.fetchgraph", entityGraph);

        return query.getResultList();
    }

    public List<Rent> findAllEntityEntityGraph(EntityManager em) {
        EntityGraph<?> entityGraph = em.getEntityGraph("rentEntityGraph");
        entityGraph.addSubgraph("rentBooks");
        Query query = em.createQuery("from Rent")
            .setHint("jakarta.persistence.fetchgraph", entityGraph);

        return query.getResultList();
    }
}
