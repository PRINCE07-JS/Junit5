package com.mytests.junit5.assertions.assertarraysequals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.mytests.junit5.bookstore.model.Book;
import com.mytests.junit5.bookstore.service.BookService;

public class AssertArraysEqualsDemo {

	@Test
	public void assertArraysEqualsWithNoMessage() {

		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		Book headFirstJavaScriptBook = new Book("3", "Head First Javascript", "Wrox");
		

		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		bookService.addBook(headFirstJavaScriptBook);

		String[] actualBookIds = bookService.getBookIdsByPublisher("Wrox");
		assertArrayEquals(new String[] {"1", "3"}, actualBookIds);
	}

	@Test
	public void assertArraysEqualsWithMessage() {

		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		Book headFirstJavaScriptBook = new Book("3", "Head First Javascript", "Wrox");
		

		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		bookService.addBook(headFirstJavaScriptBook);

		String[] actualBookIds = bookService.getBookIdsByPublisher("Wrox");
		assertArrayEquals(new String[] {"1", "3"}, actualBookIds, "bookIds didn't match !");
	}

	@Test
	public void assertArraysEqualsWithMessageSupplier() {

		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignBook = new Book("2", "Head First Design Pattern", "Packt");
		Book headFirstJavaScriptBook = new Book("3", "Head First Javascript", "Wrox");
		

		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignBook);
		bookService.addBook(headFirstJavaScriptBook);

		String[] actualBookIds = bookService.getBookIdsByPublisher("Wrox");
		assertArrayEquals(new String[] {"1", "3"}, actualBookIds,  () -> "bookIds didn't match !");
	}
}
