package com.mappingproject.mappingproject.service;

import com.mappingproject.mappingproject.entity.Book;
import com.mappingproject.mappingproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

  @Autowired
  BookRepository bookRepository;

  public Book createBook(Book book){
    Book saveBook = bookRepository.save(book);
    return saveBook;
  }

  public List<Book> fetchAll() {
    List<Book> allBooks = bookRepository.findAll();
    return allBooks;
  }
}
