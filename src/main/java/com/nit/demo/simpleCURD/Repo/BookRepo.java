package com.nit.demo.simpleCURD.Repo;

import com.nit.demo.simpleCURD.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
}
