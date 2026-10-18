package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void run() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(231, 12.0));
        orders.add(new Order(389, 29.0));
        orders.add(new Order(747, 32.0));
        orders.add(new Order(517, 18.0));
        orders.add(new Order(414, 17.0));
        orders.add(new Order(777, 10.0));

        System.out.println("Итератор:");
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(order);
        }

        System.out.println();
        System.out.println("forEach:");
        orders.forEach(System.out::println);
    }

    public static void main(String[] args) {
        run();
    }
}
