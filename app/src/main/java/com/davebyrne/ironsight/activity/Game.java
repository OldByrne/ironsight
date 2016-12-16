package com.davebyrne.ironsight.activity;

/**
 * Created by Dave on 16/12/2016.
 */

public class Game {

    private String title, genre, year;

    public Game() {
    }

    public Game(String genre, String year, String title) {
        this.genre = genre;
        this.year = year;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
