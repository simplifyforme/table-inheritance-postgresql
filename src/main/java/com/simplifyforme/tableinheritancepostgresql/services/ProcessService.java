package com.simplifyforme.tableinheritancepostgresql.services;

import com.simplifyforme.tableinheritancepostgresql.entities.Book;
import com.simplifyforme.tableinheritancepostgresql.entities.Product;
import com.simplifyforme.tableinheritancepostgresql.repositories.BookRepository;
import com.simplifyforme.tableinheritancepostgresql.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProcessService {

    private final ProductRepository productRepository;
    private final BookRepository bookRepository;

    public void createNewProduct(Product product){
        productRepository.save(product);
    }
    public void createBooks(Integer number){
        int batchSize = 1000; // Adjust batch size as needed
        List<Book> books = new ArrayList<>(batchSize);

        for (int i = 0; i < number; i++) {
            Book book = new Book("bookname", 200, "none", "1234");
            // Optionally, set properties of the book here
            books.add(book);
            bookRepository.save(book);

            if (books.size() == batchSize) {
//                bookRepository.saveAll(books);
                books.clear(); // Clear the list to prepare for the next batch
            }
        }
        if(!books.isEmpty()){
//            bookRepository.saveAll(books);
        }
    }

}
