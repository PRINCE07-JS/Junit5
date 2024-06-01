package com.mytests.junit5.bookstore.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mytests.junit5.bookstore.model.Book;

public class BookService {

	private List<Book> listOfBooks = new ArrayList<>();
	
	//adds the book to the list
	public void addBook(Book book) {
		listOfBooks.add(book);
	}
	
	//simply returns the books
	public List<Book> books(){
		return Collections.unmodifiableList(listOfBooks);
	}
	
}
