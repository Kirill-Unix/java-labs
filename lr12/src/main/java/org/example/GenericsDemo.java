package org.example;

public class GenericsDemo {
    public static void run() {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        String str = stringBox.getValue();
        System.out.println("Box<String>: " + str);

        Box<Integer> intBox = new Box<>();
        intBox.setValue(123);
        int num = intBox.getValue();
        System.out.println("Box<Integer>: " + num);

        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(3.14);
        double d = doubleBox.getValue();
        System.out.println("Box<Double>: " + d);

        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println("Pair: " + pair.getKey() + " = " + pair.getValue());
    }

    public static void main(String[] args) {
        run();
    }
}
