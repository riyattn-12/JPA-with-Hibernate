package com.example.JPA2_Hibernate.Repository;

import com.example.JPA2_Hibernate.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {

    @Query("from Employee")
    List<Employee> findAllStudents();
    @Query("select e.firstName,e.lastName from Employee e")
    List<Object[]> findPartialData();


//
    @Query("from Employee where firstName=:first")
    List<Employee> findNamedParams(@Param("first") String firstName);

   //Ques: Display the first name, last name of all employees having salary greater than
    //average salary ordered in ascending by their age and in descending by their salary.
    @Query("select e.firstName, e.lastName from Employee e where e.salary > (select avg(salary) from Employee) order by e.age asc,e.salary desc")
    List<Object[]> findSalary();

    @Query("from Employee where age>:min and age<:max")
    List<Employee> findAgeWithRange(@Param("min")int min, @Param("max") int max);


    //Ques: Delete all employees with minimum salary.
    @Query("select min(e.salary) from Employee e")
    Long findMin();
    @Modifying
    @Query("delete from Employee e where e.salary=:minSalary")
    void findDeleteMinSalary(@Param("minSalary")long minsalary);

    //Ques: Update salary of all employees by a salary passed
    // as a parameter whose existing salary is less than the average salary.


    //average salary
    @Query("select avg(salary) from Employee")
    Long findAvg();

    //updating
    @Modifying
    @Query("update Employee  set salary=:avgSalary where salary<:avgSalary")
    void findUpdatedSalary(@Param("avgSalary")long avgsalary );



    //Native Queries
    //Ques: Display the id, first name, age of all employees where last name ends with "singh"
    @Query(value = "select e.id, e.firstName,e.age from employee e where e.lastName='singh'",nativeQuery = true)
    List<Object[]> findLastName();


    //Ques: Delete all employees with age greater than 45(Should be passed as a parameter

    @Modifying
    @Query(value = "delete from employee e where e.age>:age",nativeQuery = true)
    void deleteAllEmployee(@Param("age") int age);




}
