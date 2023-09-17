package com.rt.redistemplatedemo.repo;

import com.rt.redistemplatedemo.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book, String> {


}
