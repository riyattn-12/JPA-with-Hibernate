package com.example.ManyToMany.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "books")
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int price;

    @ManyToMany(mappedBy = "books")

    Set<Author> authors;
    public Book()
     {

     }

    public Book(int id, String name, int price, Set<Author> authors) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.authors = authors;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
