package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println();
            System.out.println("1 Пример Кот");
            System.out.println("2 Задание 1 Точка");
            System.out.println("3 Задание 2 Сотрудник");
            System.out.println("4 Задание 3 Месяц/Сезон");
            System.out.println("0 Выход");
            System.out.print("Ваш выбор: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    runCat();
                    break;
                case 2:
                    PointDemo.run();
                    break;
                case 3:
                    EmployeeDemo.run();
                    break;
                case 4:
                    MonthDemo.run();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }

        scanner.close();
    }

    private static void runCat() {
        Cat ourcat = new Cat(4, "Барсик", "рыжий");
        ourcat.eat();
        ourcat.sleep();
        String say = ourcat.speak("Play with me");
        System.out.println(say);
    }
}
