package com.twu.biblioteca;
import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("What would you like to do? Press 1 + Enter to show list of books. Press 0 + Enter to exit.");
        int keyPressed = scanner.nextInt();
        menuOptions(keyPressed);
    }

    private static void menuOptions(int keyPressed) {
        switch (keyPressed) {
            case 1:
                System.out.println(Library.getBooks());
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Invalid key, press another again.");
                break;
        }
    }
}
