package org.example;

public class MonthDemo {
    public static void run() {
        Month[] months = {
                new Month("Январь", Season.WINTER),
                new Month("Февраль", Season.WINTER),
                new Month("Март", Season.SPRING),
                new Month("Апрель", Season.SPRING),
                new Month("Май", Season.SPRING),
                new Month("Июнь", Season.SUMMER),
                new Month("Июль", Season.SUMMER),
                new Month("Август", Season.SUMMER),
                new Month("Сентябрь", Season.AUTUMN),
                new Month("Октябрь", Season.AUTUMN),
                new Month("Ноябрь", Season.AUTUMN),
                new Month("Декабрь", Season.WINTER)
        };

        System.out.println("Зимние месяцы:");
        for (Month m : months) {
            if (m.getSeason() == Season.WINTER) {
                System.out.println(m.getName() + " - " + m.getSeason());
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
