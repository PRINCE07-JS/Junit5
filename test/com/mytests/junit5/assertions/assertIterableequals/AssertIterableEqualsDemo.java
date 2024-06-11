package com.mytests.junit5.assertions.assertIterableequals;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.mytests.junit5.bookstore.model.Book;
import com.mytests.junit5.bookstore.service.BookService;

public class AssertIterableEqualsDemo {
	
	@Test
	public void assertIterableEqualsWithNoMessage() {

		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		Book headFirstJavaScriptBook = new Book("3", "Head First Javascript", "Wrox");
		

		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		bookService.addBook(headFirstJavaScriptBook);

		List<String> actualBookTitles = bookService.getBookTitlesByPublisher("Wrox");
		List<String> expectedBookTitles = new ArrayList<>();
		expectedBookTitles.add("Head First Java");
		expectedBookTitles.add("Head First Javascript");
		
		assertIterableEquals(expectedBookTitles, actualBookTitles);
	}

	@Test
	public void assertiterableEqualsWithMessage() {

		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		Book headFirstJavaScriptBook = new Book("3", "Head First Javascript", "Wrox");
		

		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		bookService.addBook(headFirstJavaScriptBook);

		List<String> actualBookTitles = bookService.getBookTitlesByPublisher("Wrox");
		List<String> expectedBookTitles = new ArrayList<>();
		expectedBookTitles.add("Head First Java");
		expectedBookTitles.add("Head First Javascript");
		
		assertIterableEquals(expectedBookTitles, actualBookTitles, "Book titles didn't match");
	}

	@Test
	public void assertIterableEqualsWithMessageSupplier() {

		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		Book headFirstJavaScriptBook = new Book("3", "Head First Javascript", "Wrox");
		

		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		bookService.addBook(headFirstJavaScriptBook);

		List<String> actualBookTitles = bookService.getBookTitlesByPublisher("Wrox");
		List<String> expectedBookTitles = new ArrayList<>();
		expectedBookTitles.add("Head First Java");
		expectedBookTitles.add("Head First Javascript");
		
		assertIterableEquals(expectedBookTitles, actualBookTitles, () -> "Book titles didn't match");
	}
}
