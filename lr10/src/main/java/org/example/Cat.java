package org.example;

public class Cat implements SoundMaker, Movable, Feedable {
    private String name;
    private String color;
    private int speed;
    private boolean hungry;

    public Cat(String name, String color, int speed, boolean hungry) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу!");
    }

    @Override
    public String getSoundType() {
        return "Мяуканье";
    }

    @Override
    public void move() {
        System.out.println("Крадется бесшумно");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void feed() {
        System.out.println(name + " ест рыбу");
    }

    @Override
    public boolean isHungry() {
        return hungry;
    }
}
