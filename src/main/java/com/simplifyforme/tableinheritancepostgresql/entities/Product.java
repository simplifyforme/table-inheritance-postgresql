package com.simplifyforme.tableinheritancepostgresql.entities;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author SimplifyForMe
 */
@Setter
@Getter
@Entity
@Builder
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="products")
public class Product {

  @Id
  @GeneratedValue
  private Integer id;

  @Column(name = "name_product", nullable = false)
  private String nameProduct;

  private float price;

  public Product(){
  }
  public Product(String nameProduct, float price){
    this.nameProduct = nameProduct;
    this.price = price;
  }
  public Product(Integer id, String nameProduct, float price){
    this.id = id;
    this.nameProduct = nameProduct;
    this.price = price;
  }

}
