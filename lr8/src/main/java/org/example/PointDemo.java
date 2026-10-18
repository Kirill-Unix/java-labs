package org.example;

public class PointDemo {
    public static void run() {
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D(1, 2, 3);

        System.out.println("Point3D(): " + p1.getX() + "; " + p1.getY() + "; " + p1.getZ());
        System.out.println("Point3D(1, 2, 3): " + p2.getX() + "; " + p2.getY() + "; " + p2.getZ());
    }

    public static void main(String[] args) {
        run();
    }
}
