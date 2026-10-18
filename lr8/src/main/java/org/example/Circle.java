package org.example;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double x, double y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Рисую круг";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }
}
