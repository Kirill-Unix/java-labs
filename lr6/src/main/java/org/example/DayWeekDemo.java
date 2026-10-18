package org.example;

public class DayWeekDemo {
    public static void run() {
        DayWeek day = new DayWeek();
        System.out.println("По умолчанию: " + day.Get() + " - " + day.GetName());

        day.Set(3);
        System.out.println("После Set(3): " + day.Get() + " - " + day.GetName());

        day.Set(9);
        System.out.println("После Set(9): " + day.Get() + " - " + day.GetName());
    }

    public static void main(String[] args) {
        run();
    }
}
