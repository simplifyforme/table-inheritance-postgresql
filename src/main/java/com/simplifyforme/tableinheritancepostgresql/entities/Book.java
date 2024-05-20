package com.simplifyforme.tableinheritancepostgresql.entities;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author SimplifyForMe
 */
@Setter
@Getter
@Entity
@Table(name="books")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Book extends Product {

  private String author;

  private String isbn;

  public Book() {
  }

  public Book(String author, String isbn){
    this.author = author;
    this.isbn = isbn;
  }

  public Book(String nameProduct, float price, String author, String isbn){
    super(nameProduct, price);
    this.author = author;
    this.isbn = isbn;
  }

  public Book(Integer id, String nameProduct, float price, String author, String isbn) {
    super(id, nameProduct, price);
    this.author = author;
    this.isbn = isbn;
  }
}
