package com.api.crud.services;

import com.api.crud.entity.Book;

import java.util.List;

public interface IBookService {
	
	List<Book> getBooks();
	Book createBook(Book book);
	Book updateBook(int bookId, Book book);
	Book getBook(int bookId);
	boolean deleteBook(int bookId);

}
