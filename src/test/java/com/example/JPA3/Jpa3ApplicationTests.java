package com.example.JPA3;

import com.example.JPA3.Entity.Address;
import com.example.JPA3.Entity.Author;
import com.example.JPA3.Repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class Jpa3ApplicationTests
{
	@Autowired
	AuthorRepository authorRepository;

	//Ques: Persist 3 subjects for each author.
	@Test
	public void createSubject()
	{
		Author author= new Author();
		author.setName("Riya");
		Address address= new Address();
		address.setLocation("delhi");
		address.setState("delhi");
		address.setLocation("Dwarka");
		address.setStreetnumber("6");

		author.setAddress(address);

		HashSet<String> subject = new HashSet<>();
		subject.add("java");
		subject.add("python");
		subject.add("networks");

		author.setSubjects(subject);

		authorRepository.save(author);




	}


}
