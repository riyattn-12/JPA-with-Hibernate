package com.example.Inheritance_Mapping_Hibernate.Repository;

import com.example.Inheritance_Mapping_Hibernate.Entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Mobile,Integer>
{

}
