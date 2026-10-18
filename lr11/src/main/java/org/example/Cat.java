package org.example;

public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Мяу-мяу!";
    }

    @Override
    public void move() {
        System.out.println("Кошка прыгает");
    }
}
