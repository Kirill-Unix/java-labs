package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println();
            System.out.println("1 Drawable / Circle");
            System.out.println("2 Множественная реализация интерфейсов (Shape)");
            System.out.println("3 Животные");
            System.out.println("0 Выход");
            System.out.print("Ваш выбор: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    DrawableDemo.run();
                    break;
                case 2:
                    MultiInterfaceDemo.run();
                    break;
                case 3:
                    AnimalDemo.run();
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
