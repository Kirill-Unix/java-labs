package org.example;

public class PointDemo {
    public static void run() {
        Point a = new Point(1, 2);
        Point b = new Point(4, 6);
        double distance = a.distanceTo(b);
        System.out.println("Точка А: (" + a.getX() + "; " + a.getY() + ")");
        System.out.println("Точка B: (" + b.getX() + "; " + b.getY() + ")");
        System.out.println("Расстояние А-B: " + distance);
    }

    public static void main(String[] args) {
        run();
    }
}
