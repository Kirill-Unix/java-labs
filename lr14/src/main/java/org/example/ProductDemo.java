package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

public class ProductDemo {
    private static final String FILE_NAME = "f.txt";

    public static void run(Scanner scanner) {
        System.out.println("Введите 10 целых чисел:");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (int number : numbers) {
                writer.write(String.valueOf(number));
                writer.newLine();
            }
            System.out.println("Числа записаны в файл " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        System.out.println();
        System.out.println("Числа из файла " + FILE_NAME + ":");
        long product = 1;
        try {
            for (String line : Files.readAllLines(Path.of(FILE_NAME))) {
                int number = Integer.parseInt(line.trim());
                System.out.print(number + " ");
                product *= number;
            }
            System.out.println();
            System.out.println("Произведение всех чисел: " + product);
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Некорректные данные в файле: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            scanner.useLocale(Locale.ROOT);
            run(scanner);
        }
    }
}
