package org.example;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age) {
        this(name, age, "Адрес не указан");
    }

    public Person(String name) {
        this(name, 0, "Адрес не указан");
    }

    public Person() {
        this("Без имени", 0, "Адрес не указан");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
