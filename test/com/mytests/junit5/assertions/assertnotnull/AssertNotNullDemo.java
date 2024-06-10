package com.mytests.junit5.assertions.assertnotnull;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.mytests.junit5.bookstore.model.Book;
import com.mytests.junit5.bookstore.service.BookService;

public class AssertNotNullDemo {
	
	@Test
	public void assertNotNullWithNoMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		Book actualBook = bookService.getBookById("2");
		assertNotNull(actualBook);
	}
	
	@Test
	public void assertNotNullWithMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		Book actualBook = bookService.getBookById("2");
		assertNotNull(actualBook, "Book is null");
	}
	
	@Test
	public void assertNotNullWithSupplierMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		Book actualBook = bookService.getBookById("2");
		assertNotNull(actualBook, () -> "Book is null");
	}
}
