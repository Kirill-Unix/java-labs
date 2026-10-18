package org.example;

public class FractionDemo {
    public static void run() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);

        System.out.println("Дробь 1: " + f1 + " = " + f1.toDecimal());
        System.out.println("Дробь 2: " + f2 + " = " + f2.toDecimal());
    }

    public static void main(String[] args) {
        run();
    }
}
