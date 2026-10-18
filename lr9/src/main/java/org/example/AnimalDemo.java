package org.example;

public class AnimalDemo {
    public static void run() {
        Dog dog = new Dog("Шарик", 3, "Овчарка");
        System.out.println("Имя: " + dog.getName() + ", возраст: " + dog.getAge() + ", порода: " + dog.getBreed());
        dog.makeSound();
    }

    public static void main(String[] args) {
        run();
    }
}
