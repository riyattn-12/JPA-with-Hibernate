package com.example.OneToManyUnidirectional.Entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "authors")
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private Integer author_id;
    private String name;


    @OneToMany(cascade = CascadeType.PERSIST)

    private Set<Book> books = new HashSet<>();       //an author can have many books

    public Author()
    {

    }

    public Author(int author_id, String name, Set<Book> books) {
        this.author_id = author_id;
        this.name = name;
        this.books = books;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_id=" + author_id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

}


