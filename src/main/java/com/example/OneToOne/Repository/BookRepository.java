package com.example.OneToOne.Repository;

import com.example.OneToOne.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
