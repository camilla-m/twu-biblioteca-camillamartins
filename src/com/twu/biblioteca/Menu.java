package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("What would you like to do? Press 1 to show list of books / 2 to checkout book / 3 to return books / 9 to exit.");
        int keyPressed = scanner.nextInt();
        menuOptions(keyPressed);
    }

    private static void menuOptions(int keyPressed) {

            switch (keyPressed) {
                case 1:
                    Library.getAvailableBooks();
                    showMenu();
                    break;
                case 2:
                    Library.checkOutBook();
                    showMenu();
                    break;
                case 3:
                    Library.returnBook();
                    showMenu();
                    case 9:
                    System.exit(0);
                default:
                    System.out.println("Invalid key, press another again.");
                    break;
            }
    }
}

