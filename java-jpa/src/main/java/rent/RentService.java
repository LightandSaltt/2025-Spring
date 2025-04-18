package rent;

import book.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;
import jpa.JpaTemplate;
import member.Member;

public class RentService {

    private final RentRepository rentRepository = new RentRepository();
    private final JpaTemplate jpaTemplate = JpaTemplate.getInstance();

    public void addRent(String userId, List<Long> bkIdx) {

        EntityManager em = jpaTemplate.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();
            List<Book> books = new ArrayList<Book>();

            bkIdx.forEach(id -> {
                books.add(em.find(Book.class, id));
            });

            Member member = em.find(Member.class, userId);

            Rent rent = new Rent();
            rent.setTitle(books.getFirst().getTitle() + "외 [" + (books.size()-1) + "권]");

            List<RentBook> rentBooks = books.stream().map(book -> {
                RentBook rb = new RentBook();
                rb.setBook(book);
                rb.setBookTitle(book.getTitle());
                rb.setRent(rent);
                return rb;
            }).toList();

            rent.setMember(member);
//            rent.setRentBooks(rentBooks);
            em.persist(rent);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }


    }

    // 대출건에 대출 도서 정보 추가
    public void addRentBook(String userId, long rentId,long bkIdx){
        EntityManager em = jpaTemplate.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Book book = em.find(Book.class, bkIdx); // book 정보
            Rent rent = em.find(Rent.class, userId); // rent 정보 rentId 대출건 조회


            RentBook rentBook = new RentBook();
            rentBook.setBookTitle(book.getTitle());
            rentBook.setBook(book);

            rentBook.setRent(rent);
//            em.persist(rentBook);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }
    }
}
