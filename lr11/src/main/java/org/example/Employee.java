package org.example;

public class Employee {
    private String name;
    private double salary;
    private int experience;

    public Employee(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public void work() {
        System.out.println("Работает");
    }

    public void work(int hours) {
        System.out.println("Работает " + hours + " часов");
    }

    public void work(String project) {
        System.out.println("Работает над проектом " + project);
    }

    public double calculateBonus() {
        return salary * 0.1;
    }
}
