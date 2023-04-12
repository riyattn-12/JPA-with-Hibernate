package com.example.OneToMany.Repository;

import com.example.OneToMany.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
