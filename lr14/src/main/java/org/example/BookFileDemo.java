package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BookFileDemo {
    private static final String FILE_NAME = "book.txt";

    public static void run() {
        Path path = Path.of(FILE_NAME);
        String info = """
                Название: Мастер и Маргарита
                Автор: Михаил Булгаков
                Год издания: 1967
                Издательство: Азбука
                Страниц: 480
                Жанр: роман""";

        try {
            Files.writeString(path, info);
            System.out.println("Файл " + FILE_NAME + " создан");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        File file = new File(FILE_NAME);
        System.out.println();
        System.out.println("Данные об этом файле:");
        System.out.println("  Имя: " + file.getName());
        System.out.println("  Путь: " + file.getPath());
        System.out.println("  Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("  Размер: " + file.length() + " байт");
        System.out.println("  Существует: " + (file.exists() ? "да" : "нет"));
        System.out.println("  Можно читать: " + (file.canRead() ? "да" : "нет"));
        System.out.println("  Можно писать: " + (file.canWrite() ? "да" : "нет"));
        System.out.println("  Это каталог: " + (file.isDirectory() ? "да" : "нет"));
        System.out.println("  Последнее изменение: " + file.lastModified());

        System.out.println();
        System.out.println("Информация из файла:");
        try {
            for (String line : Files.readAllLines(path)) {
                System.out.println("  " + line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        run();
    }
}
