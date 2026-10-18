package org.example;

public class EmployeeDemo {
    public static void run() {
        Employee[] employees = {
                new Employee("Иванов", 1200, "Разработчик"),
                new Employee("Петрова", 1500, "Дизайнер"),
                new Employee("Сидоров", 900, "Тестировщик"),
                new Employee("Козлов", 2100, "Тимлид"),
                new Employee("Новикова", 1100, "Аналитик"),
                new Employee("Морозов", 1750, "Девопс")
        };

        Employee max = employees[0];
        Employee min = employees[0];

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
            if (employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }

        System.out.println("Сотрудники:");
        for (Employee e : employees) {
            System.out.println(e.getName() + " - " + e.getPosition() + " - " + e.getSalary());
        }
        System.out.println("Максимальная зарплата: " + max.getName() + " - " + max.getSalary());
        System.out.println("Минимальная зарплата: " + min.getName() + " - " + min.getSalary());
    }

    public static void main(String[] args) {
        run();
    }
}
