package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String login = welcomePageToGetLoginString();
        if(Login.showLoginUserPage(login)) {
            Menu.showMenu();
        }
    }

    public static String welcomeMessage() {
        return "Welcome to Biblioteca! Please type your login (user and password) following the model: 123-1234 testing123";
    }

    public static String welcomePageToGetLoginString() {
        System.out.println(welcomeMessage());
        return scanner.nextLine();
    }

}
