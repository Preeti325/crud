package com.api.crud.controller;

import com.api.crud.entity.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookControllerTest {

    @Test
    void createAndGetBookList() {
        Book book = new Book();
        book.setName("Java Fundamentals");
        book.setAuthor("Ruby Jain");
        book.setPublication("Sun Microsystem");
        book.setCategory("Computer Programming");
        book.setPages(1500);
        book.setPrice(240);
        String name = book.getName();
        String author = book.getAuthor();
        String publication = book.getPublication();
        String category = book.getCategory();
        Integer pages = book.getPages();
        Integer price = book.getPrice();
        assertEquals("Java Fundamentals", name);
        assertEquals("Ruby Jain", author);
        assertEquals("Sun Microsystem", publication);
        assertEquals("Computer Programming", category);
        assertEquals(1500, pages);
        assertEquals(240, price);

    }
}
