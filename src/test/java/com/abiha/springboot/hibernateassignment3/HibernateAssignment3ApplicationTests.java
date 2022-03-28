package com.abiha.springboot.hibernateassignment3;

import com.abiha.springboot.hibernateassignment3.manytomany.entities.Address2;
import com.abiha.springboot.hibernateassignment3.manytomany.entities.Author2;
import com.abiha.springboot.hibernateassignment3.manytomany.entities.Book2;
import com.abiha.springboot.hibernateassignment3.manytomany.repos.Author2Repo;
import com.abiha.springboot.hibernateassignment3.onetomany.entities.Address1;
import com.abiha.springboot.hibernateassignment3.onetomany.entities.Author1;
import com.abiha.springboot.hibernateassignment3.onetomany.entities.Book1;
import com.abiha.springboot.hibernateassignment3.onetomany.repos.AuthorRepo;
import com.abiha.springboot.hibernateassignment3.onetoone.entities.Address;
import com.abiha.springboot.hibernateassignment3.onetoone.entities.Author;
import com.abiha.springboot.hibernateassignment3.onetoone.entities.Book;
import com.abiha.springboot.hibernateassignment3.onetoone.repos.BooksRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class HibernateAssignment3ApplicationTests {

	//onetoone mapping

	@Autowired
	BooksRepo booksRepo;

	@Test
	public void testCreateAuthorOneToOne(){
		Author author = new Author();
		author.setName("Stephen King");

		Address address = new Address();
		address.setStreetNumber("919");
		address.setLocation("Portland");
		address.setState("Maine");
		author.setAddress(address);

		Book book = new Book();
		book.setBookName("King of Thrills and Chills");
		book.setAuthor(author);

		booksRepo.save(book);
	}

	//onetomany mapping

	@Autowired
	AuthorRepo authorRepo;

	@Test
	void testCreateAuthorOneToMany() {
		Author1 author = new Author1();
		author.setName("Agasta");

		Address1 address = new Address1();
		address.setStreetNumber("690");
		address.setLocation("Victoria");
		address.setState("Uttar Pradesh");
		author.setAddress(address);

		Set<Book1> books = new HashSet<>();
		Book1 book = new Book1();
		book.setBookName("Death on the Nyle");
		book.setAuthor(author);

		books.add(book);

		Book1 book1 = new Book1();
		book1.setBookName("Mysterious Affairs");
		book1.setAuthor(author);

		books.add(book1);
		author.setBooks(books);

		authorRepo.save(author);
	}

	//manytomany mapping

	@Autowired
	Author2Repo author2Repo;

	@Test
	public void testManyToManyCreateProgrammer(){
		Author2 author = new Author2();
		author.setName("William Shakespeare");

		Address2 address = new Address2();
		address.setStreetNumber("13");
		address.setLocation("Park Street");
		address.setState("United Kingdom");
		author.setAddress(address);

		HashSet<Book2> books = new HashSet<Book2>();
		Book2 book = new Book2();
		book.setBookName("Romeo and Juliet");
		books.add(book);
		author.setBooks(books);
		author2Repo.save(author);
	}

}

