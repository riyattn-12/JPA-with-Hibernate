package com.example.Inheritance_TablePerClass.Repository;

import com.example.Inheritance_TablePerClass.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
