package org.example;

public class ProductDemo {
    public static void run() {
        Product p1 = new Product("Ноутбук", 1200, 2);
        Product p2 = new Product("Мышь", 25, 10);
        Product p3 = new Product("Клавиатура", 75, 5);
        Product p4 = new Product("Монитор", 300, 3);

        System.out.println("Товары:");
        Product[] products = {p1, p2, p3, p4};
        for (Product p : products) {
            System.out.println(p.getName() + " - цена: " + p.getPrice() + ", количество: " + p.getQuantity());
        }

        System.out.println("Всего товаров: " + Product.totalProducts);
        System.out.println("Общая стоимость всех товаров: " + Product.totalValue);
        System.out.println("Средняя цена: " + Product.getAveragePrice());
    }

    public static void main(String[] args) {
        run();
    }
}
