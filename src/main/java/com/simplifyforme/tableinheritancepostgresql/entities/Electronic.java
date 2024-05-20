package com.simplifyforme.tableinheritancepostgresql.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author SimplifyForMe
 */
@Setter
@Getter
@Entity
@AllArgsConstructor
@Table(name="electronics")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Electronic extends Product {

  private String brand;

  private Integer warranty;

}
