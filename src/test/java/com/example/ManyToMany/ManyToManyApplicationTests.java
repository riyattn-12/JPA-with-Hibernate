package com.example.ManyToMany;

import com.example.ManyToMany.Entity.Author;
import com.example.ManyToMany.Entity.Book;
import com.example.ManyToMany.Repository.AuthorRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class ManyToManyApplicationTests {

	@Autowired
	AuthorRepository authorRepository;

	@Test
	@Transactional
	public void createAuthor()
	{
		Author author = new Author();
		author.setName("chetan");
//		author.setBooks(new HashSet<Book>());
		HashSet<Book> books = new HashSet<Book>();
		Book book = new Book();

		book.setName("4 layers");
		books.add(book);

		authorRepository.save(author);
	}
}
