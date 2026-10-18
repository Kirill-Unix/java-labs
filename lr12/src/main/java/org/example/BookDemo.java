package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookDemo {
    public static void run() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Война и мир", "Толстой", 10, List.of(5, 4, 5)));
        books.add(new Book(2, "Преступление и наказание", "Достоевский", 9, List.of(5, 5, 4)));
        books.add(new Book(3, "Идиот", "Достоевский", 6, List.of(4, 3, 4)));
        books.add(new Book(4, "Мастер и Маргарита", "Булгаков", 8, List.of(5, 4, 5)));
        books.add(new Book(5, "Скучная книга", "Nobody", 1, List.of(2, 2, 3)));
        books.add(new Book(6, "Тоже скучная", "Nobody", 2, List.of(1, 2, 2)));
        books.add(new Book(7, "Анна Каренина", "Толстой", 7, List.of(4, 5, 4)));
        books.add(new Book(8, "Слабая книга", "Nobody", 3, List.of(3, 2, 3)));

        System.out.println("Исходный список:");
        books.forEach(System.out::println);

        System.out.println();
        System.out.println("1. Удаление книг со средним рейтингом < 3:");
        books.removeIf(book -> book.getAverageRating() < 3);
        books.forEach(book -> System.out.println("  " + book.getTitle() + " - " + book.getAverageRating()));

        System.out.println();
        System.out.println("2. Повышение популярности книг со средним рейтингом >= 4:");
        for (Book book : books) {
            if (book.getAverageRating() >= 4) {
                book.setPopularity(book.getPopularity() + 1);
                System.out.println("  " + book.getTitle() + " -> популярность " + book.getPopularity());
            }
        }

        System.out.println();
        System.out.println("3. printBooks(список, популярность = 11):");
        printBooks(books, 11);

        System.out.println();
        System.out.println("4. Сортировка по убыванию среднего рейтинга, при совпадении - по названию:");
        books.sort(Comparator.comparingDouble(Book::getAverageRating).reversed()
                .thenComparing(Book::getTitle));
        for (Book book : books) {
            System.out.println(book.getId() + " | " + book.getTitle() + " | " + book.getAverageRating());
        }
    }

    public static void printBooks(List<Book> books, int popularity) {
        boolean found = false;
        for (Book book : books) {
            if (book.getPopularity() == popularity) {
                System.out.println("  " + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("  Книг с популярностью " + popularity + " не найдено");
        }
    }

    public static void main(String[] args) {
        run();
    }
}
