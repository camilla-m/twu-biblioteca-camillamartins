package com.twu.biblioteca;

public class Books {

    public int year;
    public String author;
    public String name;
    public boolean available;

    public Books(String author, String name, int year, boolean available) {
        this.year = year;
        this.author = author;
        this.name = name;
        this.available = available;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String getTitle() {
        return this.name;
    }

    public String toString() {
        return this.name + " " + this.author + " " + this.year;
    }

    public boolean getAvailability() {
        return this.available;
    }
}
