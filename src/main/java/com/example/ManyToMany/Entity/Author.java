package com.example.ManyToMany.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "author")
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;       //primary Key
    private String name;

    //set of books
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_Book",
    joinColumns = @JoinColumn(name = "author_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName ="id"))
    private Set<Book> books;


    public Author()
    {

    }

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
