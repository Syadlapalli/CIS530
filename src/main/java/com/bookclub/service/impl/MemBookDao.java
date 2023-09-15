package com.bookclub.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookclub.model.Book;
import com.bookclub.service.dao.BookDao;

public class MemBookDao implements BookDao {

	private List<Book> books;
    public MemBookDao() {
        books = new ArrayList<>();
        books.add(new Book("4234568903", "Core Java", "This is a Core Java", 15, Arrays.asList("Author1")));
        books.add(new Book("9345008901", "Spring Boot", "This is a Spring Boot", 25, Arrays.asList("Author2", "Author3")));
        books.add(new Book("4786789012", "Thymeleaf", "This is a Thymeleaf", 35, Arrays.asList("Author4")));
    }
    @Override
    public List<Book> list() {
        return this.books;
    }

    @Override
    public Book find(String key) {

        for (Book book:this.books){
            if(book.getIsbn().equals(key)){
                return book;
            }
        }
        return new Book();
    }

}
