package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class DivisibleDemo {
    private static final String FILE_NAME = "f.txt";

    public static void run() {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (int i = 0; i < 10; i++) {
                writer.write(String.valueOf(random.nextInt(201) - 100));
                writer.newLine();
            }
            System.out.println("10 случайных целых чисел записаны в файл " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        try {
            int count = 0;
            System.out.println();
            System.out.println("Числа из файла " + FILE_NAME + ":");
            for (String line : Files.readAllLines(Path.of(FILE_NAME))) {
                int number = Integer.parseInt(line.trim());
                System.out.print(number + " ");
                if (number % 5 == 0) {
                    count++;
                }
            }
            System.out.println();
            System.out.println("Количество чисел, кратных 5: " + count);
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Некорректные данные в файле: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        run();
    }
}
