package com.api.crud.services;

import com.api.crud.dao.IBookDAO;
import com.api.crud.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
	
	@Autowired
	private IBookDAO dao;

	@Override
	public List<Book> getBooks() {
		return dao.getBooks();
	}

	@Override
	public Book createBook(Book book) {
		return dao.createBook(book);
	}

	@Override
	public Book updateBook(int bookId, Book book) {
		return dao.updateBook(bookId, book);
	}

	@Override
	public Book getBook(int bookId) {
		return dao.getBook(bookId);
	}

	@Override
	public boolean deleteBook(int bookId) {
		return dao.deleteBook(bookId);
	}

}
