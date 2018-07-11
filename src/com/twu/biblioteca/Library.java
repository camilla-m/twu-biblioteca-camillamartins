package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Library {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Books> books = Arrays.asList(new Books("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 1997, true),
            new Books("Uncle Bob", "Clean Code", 2008, false), new Books("Elizabeth Eulberg", "The Lonely Hearts Club", 2010, true));

    public static void getAvailableBooks() {
        List<Books> availableBooks = new ArrayList<Books>();
        for (Books book : books
                ) {
            if (book.available) {
                availableBooks.add(book);
            }
        }
        System.out.println(availableBooks.toString());
    }

    public static void checkOutBook() {
        System.out.println("Write the book title to checkout your book: ");
        String titleBook = scanner.nextLine();
        Library.findAndGetBook(titleBook);
    }

    public static void returnBook() {
        System.out.println("Write the book title to return book: ");
        String titleBook = scanner.nextLine();
        Library.findAndReturnBook(titleBook);
    }

    public static boolean findAndGetBook(String title) {
        Books book = findBookByName(title);
        if(book.available) {
            System.out.println("Thank you and enjoy your book!");
            book.available = false;
        }
        else
            System.out.println("That book is not available.");
        return book.available;
    }

    public static Books findBookByName(String input) {
        Books foundBook = null;
        try {
            for (Books book : books
                    ) {
                if (book.name.contentEquals(input))
                    foundBook = book;
            }
        } catch (Exception e) {
            System.out.println("Sorry, can't find the book.");
        }
        return foundBook;
    }

    public static boolean findAndReturnBook(String title) {
        Books book = findBookByName(title);
        boolean wasAvailableBeforeReturn = false;

        if(book.available == false) {
            System.out.println("Thank you for returning the book.");
            book.available = true;
        }
        else {
            System.out.println("That is not a valid book to return.");
            wasAvailableBeforeReturn = true;
        }
        return wasAvailableBeforeReturn;
    }
}
