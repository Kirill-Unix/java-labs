package org.example;

public class PersonDemo {
    public static void run() {
        Person p1 = new Person("Анна", 25, "Минск");
        Person p2 = new Person("Борис", 40);
        Person p3 = new Person("Вика");
        Person p4 = new Person();

        Person[] people = {p1, p2, p3, p4};
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getAge() + " лет, " + p.getAddress());
        }
    }

    public static void main(String[] args) {
        run();
    }
}
