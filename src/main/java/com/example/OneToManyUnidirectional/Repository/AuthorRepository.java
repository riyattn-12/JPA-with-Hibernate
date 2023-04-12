package com.example.OneToManyUnidirectional.Repository;

import com.example.OneToManyUnidirectional.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
