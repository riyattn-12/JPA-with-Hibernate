package com.example.Inheritance_TablePerClass.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Cheque")
@DiscriminatorValue("ch")

public class Cheque extends Payment
{
        private String chequeNumber;
        public String getChequeNumber() {
            return chequeNumber;
        }

        public void setChequeNumber(String chequeNumber) {
            this.chequeNumber = chequeNumber;
        }
}
