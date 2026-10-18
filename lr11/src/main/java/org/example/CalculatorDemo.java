package org.example;

public class CalculatorDemo {
    public static void run() {
        Calculator calc = new Calculator();
        System.out.println("calculate(5, 3) = " + calc.calculate(5, 3));
        System.out.println("calculate(5, 3, 2) = " + calc.calculate(5, 3, 2));
        System.out.println("calculate(5.5, 3.2) = " + calc.calculate(5.5, 3.2));
        System.out.println("calculate(5, 3.5) = " + calc.calculate(5, 3.5));
        System.out.println("calculate(5.5, 3) = " + calc.calculate(5.5, 3));
    }

    public static void main(String[] args) {
        run();
    }
}
