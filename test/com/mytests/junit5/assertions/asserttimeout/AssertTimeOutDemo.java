package com.mytests.junit5.assertions.asserttimeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.mytests.junit5.bookstore.model.Book;
import com.mytests.junit5.bookstore.service.BookService;

public class AssertTimeOutDemo {
	
	@Test
	public void assertTimeoutWithNoMessage() {
		
		BookService bookService = new BookService();
		
		for(int i = 1; i <= 10000; i++) {
			bookService.addBook(new Book(String.valueOf(i) , "Head First Java", "Wrox"));
		}
		
		List<String> actualBookTitles = new ArrayList<>();
		
		assertTimeout(Duration.ofMillis(1), () -> {
			actualBookTitles.addAll(bookService.getBookTitlesByPublisher("Wrox"));
		});
		
		assertEquals(10000, actualBookTitles.size());
		
	}
	
	@Test
	public void assertTimeoutWithMessage() {
		
		BookService bookService = new BookService();
		
		for(int i = 1; i <= 10000; i++) {
			bookService.addBook(new Book(String.valueOf(i) , "Head First Java", "Wrox"));
		}
		
		List<String> actualBookTitles = new ArrayList<>();
		
		assertTimeout(Duration.ofMillis(1), () -> {
			actualBookTitles.addAll(bookService.getBookTitlesByPublisher("Wrox"));
		}, "Performance issue with getBookTitlesByPublisher() Method !");
		
		assertEquals(10000, actualBookTitles.size());
		
	}
	
	@Test
	public void assertTimeoutWithMessageSupplier() {
		
		BookService bookService = new BookService();
		
		for(int i = 1; i <= 10000; i++) {
			bookService.addBook(new Book(String.valueOf(i) , "Head First Java", "Wrox"));
		}
		
		List<String> actualBookTitles = new ArrayList<>();
		
		assertTimeout(Duration.ofMillis(1), () -> {
			actualBookTitles.addAll(bookService.getBookTitlesByPublisher("Wrox"));
		}, () -> "Performance issue with getBookTitlesByPublisher() Method !");
		
		assertEquals(10000, actualBookTitles.size());
		
	}
	
}
