package com.example.inventory.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Inventory {

  @Id
  private Long productId;
  private String name;
  private Float price;
  private Integer quantity;


}

