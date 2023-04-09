package com.JPA.Hibernate.springrestHibernatedemo.Repository;

import com.JPA.Hibernate.springrestHibernatedemo.Entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> , PagingAndSortingRepository<Employee,Integer>
{
    List<Employee> findByName(String riya);


    List<Employee> findByNameLike(String s);


    List<Employee> findEmployeeWithRange(int age1 ,int age2);

    Page<Employee> findAll(Pageable pageable);
}
