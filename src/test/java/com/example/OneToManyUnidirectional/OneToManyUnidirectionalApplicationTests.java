package com.example.OneToManyUnidirectional;

import com.example.OneToManyUnidirectional.Entity.Author;
import com.example.OneToManyUnidirectional.Entity.Book;
import com.example.OneToManyUnidirectional.Repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class OneToManyUnidirectionalApplicationTests {

	@Autowired
	AuthorRepository authorRepository;

	@Test
	public void testCreateAuthor() {
		Author author = new Author();
		author.setName("Durgesh");

		//setting books of a author
		HashSet<Book> books = new HashSet<Book>();


		//creating book objects, to set there value.
		Book b1 = new Book();
		b1.setName("4 Wheels of Life");
		b1.setPrice(900);
		books.add(b1);


		Book b2 = new Book();
		b2.setName("Good Bye");
		b2.setPrice(800);
		books.add(b2);

		author.setBooks(books);
		//saving in author table
		authorRepository.save(author);

	}
}
