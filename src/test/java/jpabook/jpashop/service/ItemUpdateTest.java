package jpabook.jpashop.service;
import jpabook.jpashop.domain.item.Book;
import org.junit.Test;
import jakarta.persistence.EntityManager;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemUpdateTest {

    @Autowired
    EntityManager em;

    @Test
    public void updateTest() throws Exception {
        Book book = em.find(Book.class, 1L);

        //TX : 트랜잭션
        book.setName("변경된 내용");

        //변경감지 == dirty checking
        //TX commit
    }
}
