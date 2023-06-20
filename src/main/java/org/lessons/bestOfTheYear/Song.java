package org.lessons.bestOfTheYear;

public class Song {
    // FIELDS
    private int id;
    private String title;

    // Costruttore


    public Song(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return title;
    }
}
