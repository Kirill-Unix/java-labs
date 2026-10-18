package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println();
            System.out.println("1 Пример Person");
            System.out.println("2 Задание 4 Товары");
            System.out.println("0 Выход");
            System.out.print("Ваш выбор: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    PersonDemo.run();
                    break;
                case 2:
                    ProductDemo.run();
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
