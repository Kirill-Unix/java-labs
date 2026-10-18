package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class SplitDemo {
    private static final String SOURCE = "f.txt";
    private static final String TWO_DIGIT = "g.txt";
    private static final String OTHER = "h.txt";

    public static void run() {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SOURCE))) {
            for (int i = 0; i < 20; i++) {
                writer.write(String.valueOf(random.nextInt(200) - 50));
                writer.newLine();
            }
            System.out.println("Случайные числа записаны в файл " + SOURCE);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        try {
            List<String> lines = Files.readAllLines(Path.of(SOURCE));
            System.out.println();
            System.out.println("Числа из файла " + SOURCE + ":");
            System.out.println(String.join(" ", lines));

            try (BufferedWriter twoDigitWriter = new BufferedWriter(new FileWriter(TWO_DIGIT));
                 BufferedWriter otherWriter = new BufferedWriter(new FileWriter(OTHER))) {
                for (String line : lines) {
                    int abs = Math.abs(Integer.parseInt(line.trim()));
                    if (abs >= 10 && abs <= 99) {
                        twoDigitWriter.write(line);
                        twoDigitWriter.newLine();
                    } else {
                        otherWriter.write(line);
                        otherWriter.newLine();
                    }
                }
            }
            System.out.println();
            System.out.println("Двузначные числа записаны в файл " + TWO_DIGIT);
            System.out.println("Остальные числа записаны в файл " + OTHER);
            System.out.println();
            System.out.println("Файл " + TWO_DIGIT + ":");
            System.out.println(String.join(" ", Files.readAllLines(Path.of(TWO_DIGIT))));
            System.out.println("Файл " + OTHER + ":");
            System.out.println(String.join(" ", Files.readAllLines(Path.of(OTHER))));
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Некорректные данные в файле: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        run();
    }
}
