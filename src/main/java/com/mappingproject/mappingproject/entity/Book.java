package com.mappingproject.mappingproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "book_id")
  Long id;

  @Column(name = "book_name")
  String name;

  @ManyToOne
  @JoinColumn(name = "author_fk_id" , referencedColumnName = "author_id")
  @JsonIgnore
  private Author author;
}
