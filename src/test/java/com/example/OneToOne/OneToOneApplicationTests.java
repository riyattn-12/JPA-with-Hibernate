package com.example.OneToOne;

import com.example.OneToOne.Entity.Author;
import com.example.OneToOne.Entity.Book;
import com.example.OneToOne.Repository.AuthorRepository;
import com.example.OneToOne.Repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OneToOneApplicationTests {

	@Autowired
	BookRepository bookRepository;
	@Test
	public void testOneToOneCreateBook()
	{
		Book book = new Book();
		book.setName("Life");
//		book.setAuthor(new Author());

		Author author = new Author();
		author.setName("Durjoy Datta");

		book.setAuthor(author);

		bookRepository.save(book);


	}

}
