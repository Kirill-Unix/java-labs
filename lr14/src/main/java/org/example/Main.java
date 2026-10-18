package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        scanner.useLocale(Locale.ROOT);
        int choice = -1;

        while (choice != 0) {
            System.out.println();
            System.out.println("1 Rласс File и его свойства");
            System.out.println("2 Байтовые потоки");
            System.out.println("3 java.nio");
            System.out.println("4 Задание 1 Файл с информацией о любимой книге");
            System.out.println("5 Задание 2 10 чисел в файл, произведение");
            System.out.println("6 Задание 3 Разбиение случайных чисел на g и h");
            System.out.println("7 Задание 4 14 температур, средняя температура");
            System.out.println("8 Задание 5 Количество чисел, кратных 5");
            System.out.println("0 Выход");
            System.out.print("Ваш выбор: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    FileDemo.run();
                    break;
                case 2:
                    ByteStreamDemo.run();
                    break;
                case 3:
                    NioDemo.run();
                    break;
                case 4:
                    BookFileDemo.run();
                    break;
                case 5:
                    ProductDemo.run(scanner);
                    break;
                case 6:
                    SplitDemo.run();
                    break;
                case 7:
                    TemperatureDemo.run(scanner);
                    break;
                case 8:
                    DivisibleDemo.run();
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
