package com.JPA.Hibernate.springrestHibernatedemo;

import com.JPA.Hibernate.springrestHibernatedemo.Entity.Employee;
import com.JPA.Hibernate.springrestHibernatedemo.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.awt.print.Pageable;
import java.util.List;

@SpringBootTest
class SpringRestHibernateDemoApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;


	//Ques: Perform Create Operation on Entity using Spring Data JPA
	@Test
	public void createEmployee() {

		Employee employee = new Employee("riya", "delhi", 21);
		employeeRepository.save(employee);
		Employee employee1 = new Employee("Shreya", "UP", 22);
		employeeRepository.save(employee1);
		Employee employee2 = new Employee("Charu", "delhi", 22);
		employeeRepository.save(employee2);
		Employee employee3 = new Employee("Supriya", "Punjab", 23);
	}

	//Ques: Perform Update Operation on Entity using Spring Data JPA.
	@Test
	public void updateEmployee() {
		Employee employee = employeeRepository.findById(1).get();
		employee.setAge(29);
		employeeRepository.save(employee);
	}

	//Ques: Perform Delete Operation on Entity using Spring Data JPA.
	@Test
	public void deleteEmployee() {
		Employee employee = employeeRepository.findById(53).get();
		employeeRepository.delete(employee);
	}

	//Ques: Perform Read Operation on Entity using Spring Data JPA.
	@Test
	public void readEmployee() {
		Employee employee1 = employeeRepository.findById(1).orElse(null);
		System.out.println(employee1.getName());
	}

	//Ques:Get the total count of the number of Employees.
	@Test
	public void totalCount() {
		System.out.println(employeeRepository.count());
	}

	//Ques: Create and use finder to find Employee by Name.
	@Test
	public void EmployeeByName() {
		List<Employee> employee = employeeRepository.findByName("Riya");
		employee.forEach(p -> System.out.println(p.getName()));

	}

	//Ques: Create and use finder to find Employees starting with A character.
	@Test
	public void EmployeeStartingWithA() {
		List<Employee> employees = employeeRepository.findByNameLike("R%");
		employees.forEach(System.out::println);

	}

	//Ques:Create and use finder to find Employees Between the age of 28 to 32.
	@Test
	public void GetEmployeeWithRange() {
		List<Employee> result = employeeRepository.findEmployeeWithRange(22, 30);
		System.out.println(result);

	}

	//Ques:Implement Pagination and Sorting on the bases of Employee Age
	@Test
	public void Sort_Page_On_Age() {
		Pageable pageable = (Pageable) PageRequest.of(0, 2, Sort.Direction.DESC, "age");
//		employeeRepo.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC,"name" ))).forEach(System.out::println);
		Page<Employee> results = employeeRepository.findAll(pageable);
		results.forEach(System.out::println);
	}
}

