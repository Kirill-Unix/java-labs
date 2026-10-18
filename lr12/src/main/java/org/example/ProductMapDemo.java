package org.example;

import java.util.HashMap;
import java.util.Map;

public class ProductMapDemo {
    public static void run() {
        Map<String, Product> products = new HashMap<>();

        products.put("Ноутбук", new Electronics("Ноутбук", "E1", 1200, 24));
        products.put("Наушники", new Electronics("Наушники", "E2", 150, 12));
        products.put("Телевизор", new Electronics("Телевизор", "E3", 800, 36));
        products.put("Молоко", new Food("Молоко", "F1", 1.5, "2026-11-01"));
        products.put("Хлеб", new Food("Хлеб", "F2", 0.8, "2026-10-20"));
        products.put("Сыр", new Food("Сыр", "F3", 5.0, "2026-12-15"));
        products.put("Куртка", new Clothing("Куртка", "C1", 200, "L"));
        products.put("Футболка", new Clothing("Футболка", "C2", 25, "M"));

        System.out.println("Всего товаров: " + products.size());
        System.out.println();
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        run();
    }
}
