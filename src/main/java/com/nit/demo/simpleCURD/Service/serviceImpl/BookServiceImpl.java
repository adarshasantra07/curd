package com.nit.demo.simpleCURD.Service.serviceImpl;

import com.nit.demo.simpleCURD.Entity.Book;
import com.nit.demo.simpleCURD.Repo.BookRepo;
import com.nit.demo.simpleCURD.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;
    @Override
    public String addbook(Book book) {
        try {
            bookRepo.save(book);
            return "Data Added";
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public List<Book> getallbook() {
        try {
            return bookRepo.findAll();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Book getbook(int id) {
        try {
           Optional<Book> n= bookRepo.findById(id);
           return n.get();
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

    @Override
    public String updatebook(int id, Book book) {
        try {
            Optional<Book> n= bookRepo.findById(id);
           if (n.isPresent()){
               n.get().setName(book.getName());
               n.get().setPrice(book.getPrice());
               bookRepo.save(n.get());
               return "updated!";
           }else {
               return "not found!";
           }
        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}
