package com.mappingproject.mappingproject.service;

import com.mappingproject.mappingproject.entity.Author;
import com.mappingproject.mappingproject.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class AuthorService {

  @Autowired
  AuthorRepository authorRepository;


  public Author createAuthor(Author author){
    author.getBooks().forEach(book -> book.setAuthor(author));
    return authorRepository.save(author);
  }

  public List<Author> getAllAuthor() {
    List<Author> authorList = authorRepository.findAll();
    return authorList;
  }


  public String deleteAuthor(Long id){
    authorRepository.deleteById(id);
    return "Author Deleted SuccessFully!";
  }


}
