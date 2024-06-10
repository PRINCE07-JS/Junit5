package com.mytests.junit5.assertions.assertnull;


import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.mytests.junit5.bookstore.model.Book;
import com.mytests.junit5.bookstore.service.BookService;

public class AssertNullDemo {
	
	@Test
	public void assertNullWithNoMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		Book actualBook = bookService.getBookById("3");
		assertNull(actualBook);
	}
	
	@Test
	public void assertNullWithMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		Book actualBook = bookService.getBookById("3");
		assertNull(actualBook, "Book is not null");
	}
	
	@Test
	public void assertNullWithSupplierMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		Book actualBook = bookService.getBookById("3");
		assertNull(actualBook, () -> "Book is not null");
	}
}
