package com.springserverless.persistence.repo;

import com.springserverless.persistence.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepoMock {

    static final List bookList = new ArrayList();
    static {
      Book aBook = new Book("some title","some author");
      bookList.add(aBook);
    }

    public Iterable<Book> findAll(){
        return bookList;
    }

    public List<Book>  findByTitle(String title){
       return bookList;
    }

    public Book findById(long id){
        return new Book("some title","some author");
    }

    public Book save(Book input){
        return input;
    }

    public Book findOne(Book input){
        return input;
    }

    public void deleteById(long id){
        return;
    }
}
