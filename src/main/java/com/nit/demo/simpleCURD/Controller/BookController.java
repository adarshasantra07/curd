package com.nit.demo.simpleCURD.Controller;

import com.nit.demo.simpleCURD.Entity.Book;
import com.nit.demo.simpleCURD.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        try {
            return bookService.addbook(book);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
    @GetMapping("/GetAllBook")
    public List<Book> getAllBook(){
        try {
            return bookService.getallbook();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
    @GetMapping("/GetBook/{id}")
    public Book getBook(@PathVariable int id){
        try {
            return bookService.getbook(id);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @PutMapping("/updateBook/{id}")
    public String updatebook(@PathVariable int id,@RequestBody Book book){

        try {
            return bookService.updatebook(id,book);

        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
