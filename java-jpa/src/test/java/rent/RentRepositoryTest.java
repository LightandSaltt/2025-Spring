package rent;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jpa.JpaTemplate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RentRepositoryTest {
    private RentRepository rentRepository = new RentRepository();
    private JpaTemplate jpaTemplate = JpaTemplate.getInstance();
    EntityManager em = null;

    @Test
    @Transactional
    @DisplayName("N+1 이슈 발생")
    public void findAll(){
        em = jpaTemplate.createEntityManager();
        rentRepository.findAll(em)
            .forEach(System.out::println);

    }

    // N+1 해결
    @Test
    public void findAllWithFetchJoin(){
        em = jpaTemplate.createEntityManager();
        rentRepository.findAllWithFetchJoin(em)
            .forEach(System.out::println);
    }

    // N+1 해결
    @Test
    public void findAllEntityGraph(){
        em = jpaTemplate.createEntityManager();
        rentRepository.findAllEntityGraph(em)
            .forEach(System.out::println);
    }

    @Test
    public void findAllEntityEntityGraph(){
        em = jpaTemplate.createEntityManager();
        rentRepository.findAllEntityEntityGraph(em)
            .forEach(System.out::println);
    }

}