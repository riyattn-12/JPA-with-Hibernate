package com.example.JPA3.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Author
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;


    //Ques: Create instance variable of Address class inside Author class and save it as embedded object.
    @Embedded
    Address address;

    //Ques: Introduce a List of subjects for author.
    @ElementCollection
    //@CollectionTable(name = "author_subjects", joinColumns = @JoinColumn(name = "id"))
    private Set<String> subjects;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }
}
