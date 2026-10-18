package org.example;

public class Calculator {
    public int calculate(int a, int b) {
        return a + b;
    }

    public int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public double calculate(double a, double b) {
        return a + b;
    }

    public double calculate(int a, double b) {
        return a * b;
    }

    public double calculate(double a, int b) {
        return a + b;
    }
}
