package org.example;

public class Dog implements SoundMaker, Movable, Feedable {
    private String name;
    private String breed;
    private int speed;
    private boolean hungry;

    public Dog(String name, String breed, int speed, boolean hungry) {
        this.name = name;
        this.breed = breed;
        this.speed = speed;
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    @Override
    public String getSoundType() {
        return "Лай";
    }

    @Override
    public void move() {
        System.out.println("Бежит на четырех лапах");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void feed() {
        System.out.println(name + " ест корм");
    }

    @Override
    public boolean isHungry() {
        return hungry;
    }
}
