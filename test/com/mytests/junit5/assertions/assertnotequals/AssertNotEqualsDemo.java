package com.mytests.junit5.assertions.assertnotequals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.mytests.junit5.bookstore.model.Book;
import com.mytests.junit5.bookstore.service.BookService;

public class AssertNotEqualsDemo {

	@Test
	public void assertNotEqualsWithNoMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		Book actualBook = bookService.getBookById("2");
		assertNotEquals("1", actualBook.getBookId());
		assertNotEquals("Head First Java", actualBook.getTitle());
	}
	
	@Test
	public void assertEqualsWithMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		Book actualBook = bookService.getBookById("2");
		assertNotEquals("1",actualBook.getBookId());
		assertNotEquals("Head First Java",actualBook.getTitle(), "Book is matched");
	}
	
	@Test
	public void assertEqualsWithSupplierMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		Book actualBook = bookService.getBookById("2");
		assertNotEquals("1",actualBook.getBookId());
		assertNotEquals("Head First Java",actualBook.getTitle(), () -> "Book is Matched");
	}

}
