package com.rt.redistemplatedemo.service;

import com.rt.redistemplatedemo.entity.Book;
import com.rt.redistemplatedemo.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    public void save(Book book) {
        bookRepository.save(book);
    }
}
