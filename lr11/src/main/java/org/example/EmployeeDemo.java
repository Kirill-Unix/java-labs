package org.example;

public class EmployeeDemo {
    public static void run() {
        Employee employee = new Employee("Иванов", 1000, 1);

        System.out.println("Перегрузка методов work() (выбор версии по параметрам):");
        employee.work();
        employee.work(8);
        employee.work("Отчет");

        System.out.println();
        System.out.println("Переопределение метода calculateBonus() (выбор по реальному типу объекта):");
        Employee[] employees = {
                new Manager("Петров", 3000, 5, 8),
                new Manager("Сидоров", 3500, 7, 12),
                new Developer("Козлов", 2500, 3, "Java"),
                new Developer("Новиков", 2800, 4, "Python"),
                new Developer("Морозов", 2200, 2, "JavaScript")
        };

        for (Employee e : employees) {
            if (e instanceof Manager m) {
                System.out.println("Manager " + m.getName() + " (команда: " + m.getTeamSize() + ")");
            }
            if (e instanceof Developer d) {
                System.out.println("Developer " + d.getName() + " (язык: " + d.getLanguage() + ")");
            }
            System.out.println("  Ставка: " + e.getSalary() + ", бонус: " + e.calculateBonus());
        }

        System.out.println();
        System.out.println("Базовый бонус (Employee): " + employee.calculateBonus());
    }

    public static void main(String[] args) {
        run();
    }
}
