package org.example;

public class DrawableDemo {
    public static void run() {
        Circle circle = new Circle("Красный", 5);
        circle.draw();
        System.out.println("Цвет: " + circle.getColor());
    }

    public static void main(String[] args) {
        run();
    }
}
