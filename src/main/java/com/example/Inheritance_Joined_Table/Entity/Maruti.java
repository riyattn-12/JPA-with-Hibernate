package com.example.Inheritance_Joined_Table.Entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "maruti")
@PrimaryKeyJoinColumn(name = "id")
public class Maruti extends Car
{
    private String model;


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }
}
