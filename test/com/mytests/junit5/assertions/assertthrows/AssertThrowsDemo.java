package com.mytests.junit5.assertions.assertthrows;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.mytests.junit5.bookstore.exception.BookNotFoundException;
import com.mytests.junit5.bookstore.model.Book;
import com.mytests.junit5.bookstore.service.BookService;

public class AssertThrowsDemo {
	
	@Test
	public void assertThrowsWithNoMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		assertThrows(BookNotFoundException.class, () -> bookService.getBookByTitle("Head First Spring"));
	}
	
	@Test
	public void assertThrowsWithMessage() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		assertThrows(BookNotFoundException.class, () -> bookService.getBookByTitle("Head First Spring"), "Different Exception thrown");
	}
	
	@Test
	public void assertThrowsWithMessageSupplier() {
		
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		
		assertThrows(BookNotFoundException.class, () -> bookService.getBookByTitle("Head First Spring"),  () -> "Different Exception thrown");
	}
	
}
