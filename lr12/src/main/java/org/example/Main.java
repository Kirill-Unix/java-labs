package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println();
            System.out.println("1 Обобщённые классы");
            System.out.println("2 Итератор");
            System.out.println("3 Задание 1 Продукты");
            System.out.println("4 Задание 2 Книги");
            System.out.println("0 Выход");
            System.out.print("Ваш выбор: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    GenericsDemo.run();
                    break;
                case 2:
                    IteratorDemo.run();
                    break;
                case 3:
                    ProductMapDemo.run();
                    break;
                case 4:
                    BookDemo.run();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }

        scanner.close();
    }
}
