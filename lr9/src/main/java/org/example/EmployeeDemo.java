package org.example;

public class EmployeeDemo {
    public static void run() {
        Employee[] employees = {
                new Manager("Иванов", 3000, 5, 8),
                new Manager("Петров", 3500, 7, 12),
                new Developer("Сидоров", 2500, 3, "Java"),
                new Developer("Козлов", 2800, 4, "Python"),
                new Developer("Новиков", 2200, 2, "JavaScript")
        };

        System.out.println("2 менеджера и 3 разработчика:");
        for (Employee e : employees) {
            e.displayInfo();
            e.work();
            System.out.println("Бонус: " + e.calculateBonus());
            System.out.println();
        }

        System.out.println("Демонстрация: нельзя создать объект абстрактного класса");
        try {
            Employee.class.getDeclaredConstructor(String.class, double.class, int.class)
                    .newInstance("Тест", 1000, 1);
        } catch (Exception ex) {
            System.out.println(ex.getClass().getName() + ": нельзя создать объект абстрактного класса Employee");
        }
    }

    public static void main(String[] args) {
        run();
    }
}
