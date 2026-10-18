package org.example;

public class TestDemo {
    public static void run() {
        MyClass obj = new MyClass();
        System.out.println(obj.getS());
        obj.setS("It's modified!");
        System.out.println(obj.getS());
    }

    public static void main(String[] args) {
        run();
    }
}
