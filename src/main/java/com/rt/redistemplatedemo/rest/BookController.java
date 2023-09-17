package com.rt.redistemplatedemo.rest;

import com.rt.redistemplatedemo.entity.Book;
import com.rt.redistemplatedemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public void saveBook(@RequestBody Book book) {
        bookService.save(book);
    }
}
