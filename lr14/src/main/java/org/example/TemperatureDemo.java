package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

public class TemperatureDemo {
    private static final String FILE_NAME = "temperature.txt";
    private static final int COUNT = 14;

    public static void run(Scanner scanner) {
        System.out.println("Введите " + COUNT + " вещественных значений температуры тела пациента:");
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < COUNT; i++) {
            content.append(scanner.nextDouble());
            if (i < COUNT - 1) {
                content.append(System.lineSeparator());
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(content.toString());
            System.out.println("Значения записаны в файл " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        try {
            double sum = 0;
            int count = 0;
            System.out.println();
            System.out.println("Данные из файла " + FILE_NAME + ":");
            for (String line : Files.readAllLines(Path.of(FILE_NAME))) {
                double value = Double.parseDouble(line.trim());
                System.out.print(value + " ");
                sum += value;
                count++;
            }
            System.out.println();
            System.out.println("Количество значений: " + count);
            System.out.println("Средняя температура тела: " + (sum / count));
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
