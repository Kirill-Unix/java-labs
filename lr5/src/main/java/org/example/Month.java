package org.example;

public class Month {
    private String name;
    private Season season;

    public Month(String name, Season season) {
        this.name = name;
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public Season getSeason() {
        return season;
    }
}
