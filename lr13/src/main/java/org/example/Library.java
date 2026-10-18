package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private String name;
    private Map<String, Book> books = new HashMap<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public Book getBook(String isbn) throws BookNotFoundException {
        Book book = books.get(isbn);
        if (book == null) {
            throw new BookNotFoundException("Книга с ISBN " + isbn + " не найдена в библиотеке \"" + name + "\"");
        }
        return book;
    }

    public void borrowBook(String isbn) throws BookNotFoundException, BookNotAvailableException {
        getBook(isbn).borrow();
    }

    public void returnBook(String isbn) throws BookNotFoundException, BookNotAvailableException {
        getBook(isbn).returnBook();
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public void printBooks() {
        for (Book book : books.values()) {
            System.out.println("  " + book);
        }
    }
}
