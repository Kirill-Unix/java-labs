package org.example;

public class TryCatchDemo {
    public static void run() {
        System.out.println("1. Деление на ноль (ArithmeticException):");
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("  Ошибка: " + e.getMessage());
        }

        System.out.println();
        System.out.println("2. Выход за границы массива:");
        try {
            int[] arr = new int[5];
            arr[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("  Индекс вне границ массива: " + e.getMessage());
        } finally {
            System.out.println("  Блок finally выполнен");
        }

        System.out.println();
        System.out.println("3. Некорректное преобразование строки в число:");
        try {
            int number = Integer.parseInt("abc");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("  Ошибка: " + e.getMessage());
        }

        System.out.println();
        System.out.println("4. Multi-catch:");
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("  Перехвачено: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        System.out.println();
        System.out.println("5. throw и throws:");
        try {
            checkAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("  Перехвачено: " + e.getMessage());
        }

        System.out.println();
        System.out.println("6. finally выполняется всегда:");
        try {
            System.out.println("  try: начало");
            returnInTry();
        } finally {
            System.out.println("  finally: выполнен до выхода из метода");
        }
    }

    public static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        System.out.println("  Возраст корректен: " + age);
    }

    public static void returnInTry() {
        try {
            System.out.println("  try: return");
            return;
        } finally {
            System.out.println("  finally: работает даже при return");
        }
    }

    public static void main(String[] args) {
        run();
    }
}
