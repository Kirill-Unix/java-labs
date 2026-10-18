package org.example;

public class LibraryDemo {
    public static void run() {
        try {
            Library library = new Library("Городская библиотека");

            Book book1 = new Book("Война и мир", "Толстой", "978-5-1234-5678-9", 1225);
            Book book2 = new Book("Преступление и наказание", "Достоевский", "978-6-0987-6543-2", 608);
            library.addBook(book1);
            library.addBook(book2);

            System.out.println("Библиотека \"" + "Городская библиотека" + "\":");
            library.printBooks();
        } catch (InvalidISBNException e) {
            System.out.println("Ошибка создания книги: " + e.getMessage());
        }

        System.out.println();
        System.out.println("1. Попытка создать книгу с неверным ISBN:");
        try {
            new Book("Битая книга", "Nobody", "12345", 100);
        } catch (InvalidISBNException e) {
            System.out.println("  Перехвачено InvalidISBNException: " + e.getMessage());
        }

        Library library = new Library("Городская библиотека");
        try {
            library.addBook(new Book("Война и мир", "Толстой", "978-5-1234-5678-9", 1225));
            library.addBook(new Book("Преступление и наказание", "Достоевский", "978-6-0987-6543-2", 608));
            library.addBook(new Book("Идиот", "Достоевский", "978-3-4567-8901-2", 544));
        } catch (InvalidISBNException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println();
        System.out.println("2. Выдача книг:");
        try {
            library.borrowBook("978-5-1234-5678-9");
            System.out.println("  Выдана книга \"Война и мир\"");
            library.borrowBook("978-5-1234-5678-9");
            System.out.println("  Выдана книга \"Война и мир\" повторно");
        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.out.println("  Перехвачено: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        try {
            library.borrowBook("978-9-9999-9999-9");
        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.out.println("  Перехвачено: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        System.out.println();
        System.out.println("3. Возврат книг:");
        try {
            library.returnBook("978-5-1234-5678-9");
            System.out.println("  Возвращена книга \"Война и мир\"");
            library.returnBook("978-5-1234-5678-9");
        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.out.println("  Перехвачено: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        System.out.println();
        System.out.println("4. Состояние библиотеки:");
        library.printBooks();
    }

    public static void main(String[] args) {
        run();
    }
}
