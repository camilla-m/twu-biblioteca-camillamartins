package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    private static List<Books> books = Arrays.asList(new Books("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 1997, true),
                new Books("Clean Code", "Uncle Bob", 2008, true));

    public static String getBooks() {
        List<Books> availableBooks = new ArrayList<Books>();
        for (Books book: books
             ) {
            if(book.available) {
                availableBooks.add(book);
            }
        }
        return availableBooks.toString();
    }
}
