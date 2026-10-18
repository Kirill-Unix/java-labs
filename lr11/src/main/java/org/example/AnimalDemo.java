package org.example;

public class AnimalDemo {
    public static void run() {
        Animal[] animals = {new Dog(), new Cat(), new Animal()};

        System.out.println("Полиморфные вызовы:");
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            animal.move();
        }

        System.out.println();
        System.out.println("Оператор instanceof:");
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("Это собака");
            } else if (animal instanceof Cat) {
                System.out.println("Это кошка");
            } else if (animal instanceof Animal) {
                System.out.println("Это просто животное");
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
