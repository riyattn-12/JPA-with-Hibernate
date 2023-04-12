package com.example.OneToManyUnidirectional.Repository;

import com.example.OneToManyUnidirectional.Entity.Book;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
