package org.example;

public class ShapeDemo {
    public static void run() {
        Shape[] shapes = {
                new Circle("Красный", 0, 0, 5),
                new Circle("Синий", 10, 10, 3),
                new Circle("Зеленый", 20, 5, 7),
                new Rectangle("Желтый", 0, 0, 4, 4),
                new Rectangle("Черный", 15, 15, 6, 3)
        };

        System.out.println("Массив из 5 фигур (3 круга, 2 прямоугольника):");
        for (Shape s : shapes) {
            s.displayInfo();
            System.out.println(s.draw());
        }

        System.out.println("Уникальные методы:");
        for (Shape s : shapes) {
            if (s instanceof Circle circle) {
                System.out.println("Круг: диаметр = " + circle.getDiameter());
            }
            if (s instanceof Rectangle rectangle) {
                System.out.println("Прямоугольник: является квадратом = " + rectangle.isSquare());
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
