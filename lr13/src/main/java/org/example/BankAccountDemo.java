package org.example;

public class BankAccountDemo {
    public static void run() {
        System.out.println("Создание счетов с проверкой в конструкторе:");
        BankAccount account1 = new BankAccount("ACC-001", "Иванов", 100);
        BankAccount account2 = new BankAccount("ACC-002", "Петров", 500);
        BankAccount account3 = new BankAccount("ACC-003", "Сидоров", 50);
        System.out.println("  " + account1);
        System.out.println("  " + account2);
        System.out.println("  " + account3);

        System.out.println();
        System.out.println("Некорректные счета:");
        try {
            new BankAccount("", "Нищий", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("  Перехвачено: " + e.getMessage());
        }
        try {
            new BankAccount("ACC-004", "Минусов", -100);
        } catch (IllegalArgumentException e) {
            System.out.println("  Перехвачено: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Успешные операции:");
        account1.deposit(50);
        try {
            account2.withdraw(200);
        } catch (InsufficientFundsException e) {
            System.out.println("  " + e.getMessage());
        }

        System.out.println();
        System.out.println("Снятие больше баланса (InsufficientFundsException):");
        try {
            account3.withdraw(100);
        } catch (InsufficientFundsException e) {
            System.out.println("  " + e.getMessage());
            System.out.println("  Запрошено: " + e.getAmount());
            System.out.println("  Баланс: " + e.getBalance());
        }

        System.out.println();
        System.out.println("Некорректная сумма:");
        try {
            account1.withdraw(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("  Перехвачено: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("  " + e.getMessage());
        }

        System.out.println();
        System.out.println("Итоговые балансы:");
        System.out.println("  " + account1);
        System.out.println("  " + account2);
        System.out.println("  " + account3);
    }

    public static void main(String[] args) {
        run();
    }
}
