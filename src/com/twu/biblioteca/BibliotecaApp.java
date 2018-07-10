package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println(welcomeMessage());
        System.out.println(Library.getBooks());
    }

    public static String welcomeMessage() {
        return "Welcome to Biblioteca!";
    }
}
