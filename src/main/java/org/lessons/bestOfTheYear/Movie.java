package org.lessons.bestOfTheYear;

public class Movie {
    private int id;
    private String title;

    // costruttore vuoto per java beans
    public Movie() {
    }

    public Movie(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
