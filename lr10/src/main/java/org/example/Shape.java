package org.example;

public class Shape implements Drawable, Moveable, Resizable {
    private int x;
    private int y;
    private double size = 1;

    @Override
    public void draw() {
        System.out.println("Рисую фигуру");
    }

    @Override
    public String getColor() {
        return "нет цвета";
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void resize(double factor) {
        size *= factor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getSize() {
        return size;
    }
}
