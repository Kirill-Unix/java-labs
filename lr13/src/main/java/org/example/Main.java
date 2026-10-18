package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println();
            System.out.println("1 try-catch-finally, throw, throws");
            System.out.println("2 Пользовательские исключения");
            System.out.println("3 Библиотека книг");
            System.out.println("0 Выход");
            System.out.print("Ваш выбор: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    TryCatchDemo.run();
                    break;
                case 2:
                    BankAccountDemo.run();
                    break;
                case 3:
                    LibraryDemo.run();
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
