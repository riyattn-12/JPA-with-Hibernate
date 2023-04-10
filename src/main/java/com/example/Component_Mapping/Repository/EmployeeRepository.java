package com.example.Component_Mapping.Repository;

import com.example.Component_Mapping.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
