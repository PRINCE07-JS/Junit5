package com.mytests.junit5.assertions.assertequals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mytests.junit5.bookstore.model.Book;
import com.mytests.junit5.bookstore.service.BookService;

public class AssertEqualsDemo {

	@Test
	public void assertEqualsWithNoMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		Book actualBook = bookService.getBookById("1");
		assertEquals("1", actualBook.getBookId());
		assertEquals("Head First Java", actualBook.getTitle());
	}
	
	@Test
	public void assertEqualsWithMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		Book actualBook = bookService.getBookById("1");
		assertEquals("1",actualBook.getBookId());
		assertEquals("Head First Java",actualBook.getTitle(), "Book didn't match");
	}
	
	@Test
	public void assertEqualsWithSupplierMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		Book actualBook = bookService.getBookById("1");
		assertEquals("1",actualBook.getBookId());
		assertEquals("Head First Java",actualBook.getTitle(), () -> "Book didn't Match");
	}
}
