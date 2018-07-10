package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;

public class Library {

    private static List<Books> books = Arrays.asList(new Books("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 1997),
                new Books("Clean Code", "Uncle Bob", 2008));

    public static String getBooks() {
        return books.toString();
    }
}
