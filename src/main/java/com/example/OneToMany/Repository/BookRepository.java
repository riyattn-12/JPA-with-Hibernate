package com.example.OneToMany.Repository;

import com.example.OneToMany.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
