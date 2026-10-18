package org.example;

public class Point2D extends Point1D {
    private int y;

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
