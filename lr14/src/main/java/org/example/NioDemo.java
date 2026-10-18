package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NioDemo {
    public static void run() {
        Path path = Paths.get("nio.txt");

        try {
            Files.writeString(path, "Данные, записанные через java.nio.file.Files");
            System.out.println("Записан файл: " + path.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        try {
            String content = Files.readString(path);
            System.out.println("Содержимое: " + content);
            System.out.println("Размер: " + Files.size(path) + " байт");
            System.out.println("Существует: " + Files.exists(path));
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        Path start = Paths.get("src");
        System.out.println();
        System.out.println("Java-файлы в " + start + ":");
        try (Stream<Path> stream = Files.find(start, 5,
                (p, attrs) -> String.valueOf(p).endsWith(".java"))) {
            long counter = stream.peek(System.out::println).count();
            System.out.println("Найдено: " + counter);
        } catch (IOException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        run();
    }
}
