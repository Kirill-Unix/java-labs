package org.example;

public class AnimalDemo {
    public static void run() {
        SoundMaker[] animals = {
                new Dog("Барсик", "Овчарка", 20, true),
                new Dog("Шарик", "Джек-рассел", 25, false),
                new Dog("Рекс", "Хаски", 30, true),
                new Cat("Мурка", "Рыжая", 12, false),
                new Cat("Персик", "Серая", 10, true)
        };

        System.out.println("3 собаки и 2 кошки:");
        for (SoundMaker animal : animals) {
            if (animal instanceof Dog dog) {
                System.out.println("Собака " + dog.getName() + " (" + dog.getBreed() + "):");
            }
            if (animal instanceof Cat cat) {
                System.out.println("Кошка " + cat.getName() + " (" + cat.getColor() + "):");
            }
            System.out.print("  Звук: ");
            animal.makeSound();
            System.out.println("  Тип звука: " + animal.getSoundType());
        }

        System.out.println();
        System.out.println("Движение:");
        for (SoundMaker animal : animals) {
            if (animal instanceof Dog dog) {
                System.out.println(dog.getName() + " (скорость " + dog.getSpeed() + " км/ч):");
            }
            if (animal instanceof Cat cat) {
                System.out.println(cat.getName() + " (скорость " + cat.getSpeed() + " км/ч):");
            }
            if (animal instanceof Movable movable) {
                movable.move();
            }
        }

        System.out.println();
        System.out.println("Кормление:");
        for (SoundMaker animal : animals) {
            if (animal instanceof Feedable feedable) {
                feedable.feed();
                System.out.println("  Голоден: " + feedable.isHungry());
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
