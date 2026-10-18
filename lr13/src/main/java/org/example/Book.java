package org.example;

import java.util.regex.Pattern;

public class Book {
    private static final Pattern ISBN_PATTERN = Pattern.compile("\\d{3}-\\d-\\d{4}-\\d{4}-\\d");

    private String title;
    private String author;
    private String isbn;
    private int pages;
    private boolean available;

    public Book(String title, String author, String isbn, int pages) throws InvalidISBNException {
        if (isbn == null || !ISBN_PATTERN.matcher(isbn).matches()) {
            throw new InvalidISBNException("Неверный формат ISBN: " + isbn + " (ожидается XXX-X-XXXX-XXXX-X)");
        }
        if (pages <= 0) {
            throw new InvalidISBNException("Количество страниц должно быть больше 0");
        }
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() throws BookNotAvailableException {
        if (!available) {
            throw new BookNotAvailableException("Книга \"" + title + "\" уже выдана читателю");
        }
        available = false;
    }

    public void returnBook() throws BookNotAvailableException {
        if (available) {
            throw new BookNotAvailableException("Книга \"" + title + "\" не была взята, возвращать нечего");
        }
        available = true;
    }

    @Override
    public String toString() {
        return "Book [" + title + ", " + author + ", ISBN: " + isbn + ", " + pages + " стр., "
                + (available ? "доступна" : "выдана") + "]";
    }
}
