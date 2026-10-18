package org.example;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo {
    public static void run() {
        File file = new File("book.txt");
        System.out.println("Данные о файле " + file.getName() + ":");
        System.out.println("  Имя: " + file.getName());
        System.out.println("  Путь: " + file.getPath());
        System.out.println("  Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("  Размер: " + file.length() + " байт");
        System.out.println("  Существует: " + (file.exists() ? "да" : "нет"));
        System.out.println("  Можно читать: " + (file.canRead() ? "да" : "нет"));
        System.out.println("  Можно писать: " + (file.canWrite() ? "да" : "нет"));
        System.out.println("  Это каталог: " + (file.isDirectory() ? "да" : "нет"));
        System.out.println("  Это обычный файл: " + (file.isFile() ? "да" : "нет"));

        File dir = new File(".");
        System.out.println();
        System.out.println("Каталог " + dir.getAbsolutePath() + ", только .txt:");
        String[] names = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File d, String name) {
                return name.endsWith(".txt");
            }
        });
        if (names != null) {
            for (String name : names) {
                File child = new File(dir, name);
                System.out.println("  " + name + (child.isDirectory() ? " (каталог)" : " (файл)"));
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
