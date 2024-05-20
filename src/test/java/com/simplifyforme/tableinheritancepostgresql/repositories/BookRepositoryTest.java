package com.simplifyforme.tableinheritancepostgresql.repositories;

import com.simplifyforme.tableinheritancepostgresql.entities.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testSaveBook() {
        Book book = new Book("bookname", 200, "none", "1234");
        bookRepository.save(book);
    }
}