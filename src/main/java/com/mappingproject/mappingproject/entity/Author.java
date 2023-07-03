package com.mappingproject.mappingproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "author")
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "author_id")
  Long id;

  @Column(name = "author_name")
  String name;

  @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
  private List<Book> books = new ArrayList<>();
}
