package org.example;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int experience, int teamSize) {
        super(name, salary, experience);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public void work() {
        System.out.println("Управляет командой");
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.2;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager [имя: " + getName() + ", зарплата: " + getSalary()
                + ", стаж: " + getExperience() + ", команда: " + teamSize + "]");
    }
}
