package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Login {

    public String username;
    private String password;
    public String name;
    public String email;
    public String phone;
    private static Scanner scanner = new Scanner(System.in);
    private static List<Login> logins = Arrays.asList(new Login("123-4567", "biblio123", "Peter", "logan@thoughtworks.com",
                    "96613215"),
            new Login("123-7654", "biblio12", "Lorna", "lorna@thoughtworks.com", "64530982"),
            new Login("123-7657", "biblio124", "Wanda", "wanda@thoughtworks.com", "54630278"));

    public Login(String username, String password, String name, String email, String phone) {
        this.password = password;
        this.username = username;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public static boolean loginUser(Login login) {
        boolean passwordUserMatches = isAuthCorrect(login);
        boolean isLogged = false;
        if(passwordUserMatches) {
            isLogged = true;
        }
        return isLogged;
    }

    public static boolean showLoginUserPage(String loginString) {
        boolean isLogged = false;
        String[] loginInfos = loginString.split(" ");
        Login login = convertUsernameToLogin(loginInfos[0], loginInfos[1]);
        if(isAuthCorrect(login)) {
            isLogged = true;
        }
        return isLogged;
    }

    public static Login convertUsernameToLogin(String username, String password) {
        Login foundLogin = null;
        try {
            for (Login login : logins
                    ) {
                if (login.username.contentEquals(username) && login.password.contentEquals(password))
                    foundLogin = login;
            }
        } catch (Exception e) {
            System.out.println("Sorry, we had problems to find this login.");
        }
        return foundLogin;
    }

    public static String convertLoginInfosToString(Login login) {
        return "Name: " + login.name + " / Email: " + login.email + " / Phone: " + login.phone;
    }

    public static void showProfile() {
        System.out.println("For security, please type again your password: ");
        String password = scanner.nextLine();
        Login.returnProfileInfos(password);
    }

    private static void returnProfileInfos(String password) {
        Login loginThisPassword = null;
        try {
            for (Login login: logins
                 ) {
                if(login.password.contentEquals(password)) {
                    loginThisPassword = login;
                }
            }
            System.out.println(convertLoginInfosToString(loginThisPassword));
        } catch (Exception e) {
            System.out.println("Cannot get infos.");
        }
    }

    private static boolean isAuthCorrect(Login login) {
        boolean correct = false;
        try {
            correct = logins.stream().anyMatch(x -> x.username == login.username && x.password == login.password);
        } catch (Exception e) {
            System.out.println("Problem with login. Check entries and try again.");
        }
        return correct;
    }
}
