package com.example.OneToManyUnidirectional.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer book_id;
    private String name;
    private float price;

    public Book()
    {

    }

    public Book(int book_id, String name, float price) {
        this.book_id = book_id;
        this.name = name;
        this.price = price;
    }


    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}

