package org.example;

public class MultiInterfaceDemo {
    public static void run() {
        Shape shape = new Shape();
        shape.draw();
        shape.move(3, 5);
        shape.resize(2);
        System.out.println("После move и resize: x = " + shape.getX() + ", y = " + shape.getY()
                + ", size = " + shape.getSize());
    }

    public static void main(String[] args) {
        run();
    }
}
