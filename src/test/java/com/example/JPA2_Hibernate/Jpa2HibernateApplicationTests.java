package com.example.JPA2_Hibernate;

import com.example.JPA2_Hibernate.Entity.Employee;
import com.example.JPA2_Hibernate.Repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
class Jpa2HibernateApplicationTests
{
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void testCreateNewEmployee() {
		Employee employee = new Employee("supriya", "khatri", 23, 90000);
		employeeRepository.save(employee);
		Employee employee1 = new Employee("shreya", "jain", 21, 87000);
		employeeRepository.save(employee1);
		Employee employee2 = new Employee("himani", "ggupta", 23, 765000);
		employeeRepository.save(employee2);
		Employee employee3 = new Employee("kunal", "bhalla", 29, 44000);
		employeeRepository.save(employee3);


	}

	@Test
	public void getAllEmployee() {
		System.out.println(employeeRepository.findAllStudents());
	}
//
//partial data
@Test
public  void getPartialData() {
	List<Object[]> partial = employeeRepository.findPartialData();
	for (Object[] objects : partial) {
		System.out.println(objects[0]);
		System.out.println(objects[1]);
	}
}

	//using named parameters
	@Test
	public void TestStuNamedParams() {
		employeeRepository.findNamedParams("supriya").forEach(System.out::println);
	}

	//Ques :Display the first name, last name of all employees having salary greater than
	// average salary ordered in ascending by their age and in descending by their salary.
	@Test
	public void getSalary() {
		List<Object[]> al = employeeRepository.findSalary();
		for(Object[] objects : al) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}

	@Test
	public void getAgeWithRange() {
		System.out.println(employeeRepository.findAgeWithRange(18,23));
	}

	//Ques: Delete all employees with minimum salary.
	@Test
	@Transactional
	@Rollback(value= false)
	public void deleteMinSalary() {
		employeeRepository.findDeleteMinSalary(employeeRepository.findMin());

	}

	//updating salary
	@Test
	@Transactional
	@Rollback(value = false)
	public void updatedSalary() {
		employeeRepository.findUpdatedSalary(employeeRepository.findAvg());
	}

	//Native Query
	//Ques: Display the id, first name, age of all employees where last name ends with "singh"
	@Test
	public void getLastName()
	{
		List<Object[]> partial = employeeRepository.findLastName();
		for(Object[] objects : partial)
		{
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println(objects[2]);

		}

	}

	//Ques: Delete all employees with age greater than 45(Should be passed as a parameter)
	@Test
	@Transactional
	@Rollback(value = false)
	public void DeleteAllEmployee()
	{
		employeeRepository.deleteAllEmployee(45);
	}

}

