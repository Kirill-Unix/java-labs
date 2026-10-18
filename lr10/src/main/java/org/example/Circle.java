package org.example;

public class Circle implements Drawable {
    private String color;
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисую круг радиусом " + radius);
    }

    @Override
    public String getColor() {
        return color;
    }
}
