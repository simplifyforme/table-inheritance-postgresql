package com.simplifyforme.tableinheritancepostgresql.repositories;

import com.simplifyforme.tableinheritancepostgresql.entities.Book;
import com.simplifyforme.tableinheritancepostgresql.entities.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testSaveBook() {
        Product product = new Product("bookname", 200);
        productRepository.save(product);
    }
}