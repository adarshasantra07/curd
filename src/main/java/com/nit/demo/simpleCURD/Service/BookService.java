package com.nit.demo.simpleCURD.Service;

import com.nit.demo.simpleCURD.Entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
     String addbook(Book book);
     List<Book> getallbook();

     Book getbook(int id);
     String updatebook(int id, Book book);
}
