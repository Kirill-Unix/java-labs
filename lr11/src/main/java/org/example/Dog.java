package org.example;

public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Гав-гав!";
    }

    @Override
    public void move() {
        System.out.println("Собака бегает");
    }
}
