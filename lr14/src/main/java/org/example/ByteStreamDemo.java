package org.example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void run() {
        String fileName = "stream.txt";

        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName))) {
            out.write("Hello, Java Streams!".getBytes());
            out.flush();
            System.out.println("Записан файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(fileName))) {
            System.out.println("Доступно байтов: " + in.available());
            System.out.print("Побайтное чтение: ");
            int b;
            while ((b = in.read()) != -1) {
                System.out.print((char) b);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        try (FileInputStream in = new FileInputStream(fileName)) {
            byte[] buffer = new byte[5];
            int read = in.read(buffer);
            System.out.println("Прочитано байтов в массив: " + read);
            System.out.println("Первые 5 символов: " + new String(buffer, 0, read));
            long skipped = in.skip(7);
            System.out.println("Пропущено байтов: " + skipped);
            int rest = in.read();
            System.out.println("Символ после skip: " + (char) rest);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        run();
    }
}
