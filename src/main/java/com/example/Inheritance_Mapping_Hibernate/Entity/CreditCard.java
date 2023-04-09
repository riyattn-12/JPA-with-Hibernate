package com.example.Inheritance_Mapping_Hibernate.Entity;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("cc")
@Table(name = "Credit_Card")
public class CreditCard extends Mobile
{
    private String creditcardNo;

    public String getCreditcardNo() {
        return creditcardNo;
    }

    public void setCreditcardNo(String creditcardNo) {
        this.creditcardNo = creditcardNo;
    }
}
