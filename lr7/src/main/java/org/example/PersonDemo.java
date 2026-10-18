package org.example;

public class PersonDemo {
    public static void run() {
        Person tom = new Person(41);
        Person bob = new Person(68);
        tom.checkAge();
        bob.checkAge();

        System.out.println(Person.retirementAge);
        Person.retirementAge = 67;
        System.out.println(Person.retirementAge);
    }

    public static void main(String[] args) {
        run();
    }
}
