package com.mappingproject.mappingproject.Controller;

import com.mappingproject.mappingproject.entity.Book;
import com.mappingproject.mappingproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
  @Autowired
  BookService bookService;

  @PostMapping
  public Book createBook(@RequestBody Book book){
    Book saveBook = bookService.createBook(book);
    return saveBook;
  }

  @GetMapping
  public List<Book> fetchAll(){
    List<Book> books = bookService.fetchAll();
    return books;
  }
}
