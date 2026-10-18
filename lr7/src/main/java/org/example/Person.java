package org.example;

class Person {
    int age;
    static int retirementAge;

    static {
        retirementAge = 65;
        System.out.println("Static initializer");
    }

    Person(int age) {
        this.age = age;
        System.out.println("Constructor");
    }

    void checkAge() {
        if (age >= retirementAge) {
            System.out.println("Уже на пенсии");
        } else {
            System.out.printf("Сколько лет осталось до пенсии: %d\n", retirementAge - age);
        }
    }
}
