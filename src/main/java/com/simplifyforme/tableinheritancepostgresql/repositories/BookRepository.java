package com.simplifyforme.tableinheritancepostgresql.repositories;

import com.simplifyforme.tableinheritancepostgresql.entities.Book;
import com.simplifyforme.tableinheritancepostgresql.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
