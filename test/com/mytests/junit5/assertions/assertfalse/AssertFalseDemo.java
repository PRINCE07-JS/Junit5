package com.mytests.junit5.assertions.assertfalse;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.mytests.junit5.bookstore.model.Book;
import com.mytests.junit5.bookstore.service.BookService;

public class AssertFalseDemo {
	
	// Method type 1
		@Test
		public void assertFalseWithNoMessage() {

			BookService bookService = new BookService();

			Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
			bookService.addBook(headFirstJavaBook);

			List<Book> listOfBooks = bookService.books();

			// to test whether listOfBooks is empty or not
			assertFalse(listOfBooks.isEmpty());
		}
		
		// Method type 4
		@Test
		public void assertFalseWithBooleanSupplierAndNoMessage() {

			BookService bookService = new BookService();

			Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
			bookService.addBook(headFirstJavaBook);

			List<Book> listOfBooks = bookService.books();

			// to test whether listOfBooks is empty or not
			assertFalse(() -> listOfBooks.isEmpty());
		}
		
		
		// Method type 2
		@Test
		public void assertFalseWithMessage() {

			BookService bookService = new BookService();

			Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
			bookService.addBook(headFirstJavaBook);

			List<Book> listOfBooks = bookService.books();

			// to test whether listOfBooks is empty or not
			assertFalse(listOfBooks.isEmpty(), "List of books is empty");
		}
		
		// Method type 5
		@Test
		public void assertFalseWithBooleanSupplierAndMessage() {

			BookService bookService = new BookService();

			Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
			bookService.addBook(headFirstJavaBook);

			List<Book> listOfBooks = bookService.books();

			// to test whether listOfBooks is empty or not
			assertFalse(() -> listOfBooks.isEmpty(), "List of books is empty");
		}
		
		// Method type 3
		@Test
		public void assertFalseWithMessageSupplier() {

			BookService bookService = new BookService();

			Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
			bookService.addBook(headFirstJavaBook);

			List<Book> listOfBooks = bookService.books();

			// to test whether listOfBooks is empty or not
			assertFalse(listOfBooks.isEmpty(), () -> "List of books is empty");
		}
		
		// Method type 6
		@Test
		public void assertTrueWithBooleanSupplierAndMessageSupplier() {

			BookService bookService = new BookService();

			Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
			bookService.addBook(headFirstJavaBook);

			List<Book> listOfBooks = bookService.books();

			// to test whether listOfBooks is empty or not
			assertFalse(() -> listOfBooks.isEmpty(), () -> "List of books is empty");
		}
}
