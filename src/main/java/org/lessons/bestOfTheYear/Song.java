package org.lessons.bestOfTheYear;

public class Song {
    // FIELDS
    private int id;
    private String title;

    // Costruttore


    public Song() {
    }

    public Song(int id, String title) {
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
