package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println(welcomeMessage());
        Menu.showMenu();
    }

    public static String welcomeMessage() {
        return "Welcome to Biblioteca!";
    }
}
