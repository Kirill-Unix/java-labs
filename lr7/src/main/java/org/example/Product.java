package org.example;

public class Product {
    private String name;
    private double price;
    private int quantity;

    static int totalProducts;
    static double totalValue;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
        totalValue += price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static double getAveragePrice() {
        if (totalProducts == 0) {
            return 0;
        }
        return totalValue / totalProducts;
    }
}
