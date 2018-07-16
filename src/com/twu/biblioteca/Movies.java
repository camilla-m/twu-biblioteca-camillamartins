package com.twu.biblioteca;

public class Movies {
    public int year;
    public String director;
    public String name;
    public int rating;
    public boolean available;

    public Movies(String director, String name, int year, int rating, boolean available) {
        this.year = year;
        this.director = director;
        this.name = name;
        this.rating = Rating.defineNotes(rating);
        this.available = available;
    }

    public String getDirector() {
        return this.director;
    }

    public int getYear() {
        return this.year;
    }

    public String getTitle() {
        return this.name;
    }

    public int getRating() { return this.rating; }

    public String toString() {
        return this.director + " " +  this.name + " " + this.year + " " + this.rating;
    }

    public boolean getAvailability() {
        return this.available;
    }
}
