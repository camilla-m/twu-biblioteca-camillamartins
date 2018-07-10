package com.twu.biblioteca;

public class Books {

    public int year;
    public String author;
    public String name;

    public Books(String author, String name, int year) {
        this.year = year;
        this.author = author;
        this.name = name;
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
}
