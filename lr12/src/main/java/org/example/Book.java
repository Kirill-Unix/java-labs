package org.example;

import java.util.List;

public class Book {
    private int id;
    private String title;
    private String author;
    private int popularity;
    private List<Integer> readerRatings;

    public Book(int id, String title, String author, int popularity, List<Integer> readerRatings) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.popularity = popularity;
        this.readerRatings = readerRatings;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public double getAverageRating() {
        if (readerRatings.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int rating : readerRatings) {
            sum += rating;
        }
        return sum / readerRatings.size();
    }

    @Override
    public String toString() {
        return "Book [" + id + ", " + title + ", " + author
                + ", популярность: " + popularity + ", средний рейтинг: " + getAverageRating() + "]";
    }
}
