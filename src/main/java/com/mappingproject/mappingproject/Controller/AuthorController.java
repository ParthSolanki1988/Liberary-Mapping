package com.mappingproject.mappingproject.Controller;

import com.mappingproject.mappingproject.entity.Author;
import com.mappingproject.mappingproject.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/author")
public class AuthorController {

  @Autowired
  AuthorService authorService;


  @PostMapping
  public ResponseEntity<Author> createAuthor(@RequestBody Author author){
    Author createAuthor = authorService.createAuthor(author);
    return new ResponseEntity<>(createAuthor , HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<Author>> getAllAuthor(){
    List<Author> allAuthor = authorService.getAllAuthor();
    return new ResponseEntity<>(allAuthor , HttpStatus.FOUND);
  }

  @DeleteMapping("{id}")
  public ResponseEntity<String> deleteById(@PathVariable("id") Long id){
    String s = authorService.deleteAuthor(id);
    return new ResponseEntity<>(s , HttpStatus.OK);
  }
}
