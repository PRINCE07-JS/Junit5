package com.mytests.junit5.assertions.asserttrue;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.mytests.junit5.bookstore.model.Book;
import com.mytests.junit5.bookstore.service.BookService;
	
public class AssertTrueDemo {

	// Method type 1
	@Test
	public void assertTrueWithNoMessage() {

		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.books();

		// to test whether listOfBooks is empty or not
		assertTrue(listOfBooks.isEmpty());
	}

	// Method type 4
	@Test
	public void assertTrueWithBooleanSupplierAndNoMessage() {

		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.books();

		// to test whether listOfBooks is empty or not
		assertTrue(() -> listOfBooks.isEmpty());
	}

	// Method type 2
	@Test
	public void assertTrueWithMessage() {

		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.books();

		// to test whether listOfBooks is empty or not
		assertTrue(listOfBooks.isEmpty(), "List of books is not empty");
	}

	// Method type 5
	@Test
	public void assertTrueWithBooleanSupplierAndMessage() {

		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.books();

		// to test whether listOfBooks is empty or not
		assertTrue(() -> listOfBooks.isEmpty(), "List of books is not empty");
	}

	// Method type 3
	@Test
	public void assertTrueWithMessageSupplier() {

		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.books();

		// to test whether listOfBooks is empty or not
		assertTrue(listOfBooks.isEmpty(), () -> "List of books is not empty");
	}

	// Method type 6
	@Test
	public void assertTrueWithBooleanSupplierAndMessageSupplier() {

		BookService bookService = new BookService();

		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		bookService.addBook(headFirstJavaBook);

		List<Book> listOfBooks = bookService.books();

		// to test whether listOfBooks is empty or not
		assertTrue(() -> listOfBooks.isEmpty(), () -> "List of books is not empty");
	}

}
