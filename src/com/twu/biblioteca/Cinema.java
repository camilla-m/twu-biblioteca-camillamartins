package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cinema {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Movies> movies = Arrays.asList(new Movies("Christopher Nolan", "Interstellar", 2014, 10, true),
            new Movies("Ridley Scott", "Thelma & Louise", 1991, 10, true),
            new Movies("Bryan Singer", "X-Men", 2000, 10, false));

    public static void getAvailableMovies() {
        List<Movies> availableMovies = new ArrayList<Movies>();
        for (Movies movie : movies
                ) {
            if (movie.available) {
                availableMovies.add(movie);
            }
        }
        System.out.println(availableMovies.toString());
    }

    public static Movies findMovieByName(String title) {
        Movies foundMovie = null;
        try {
            for (Movies movie : movies
                    ) {
                if (movie.name.contentEquals(title))
                    foundMovie = movie;
            }
        } catch (Exception e) {
            System.out.println("Sorry, can't find the movie.");
        }
        return foundMovie;
    }

    public static void checkOutMovie() {
        System.out.println("Write the movie title to checkout your movie: ");
        String titleMovie = scanner.nextLine();
        Cinema.findAndGetMovie(titleMovie);
    }

    public static void returnMovie() {
        System.out.println("Write the movie title to return movie: ");
        String titleMovie = scanner.nextLine();
        Cinema.findAndReturnMovie(titleMovie);
    }
    public static boolean findAndGetMovie(String title) {
            Movies movie = findMovieByName(title);
            if(movie.available) {
                System.out.println("Thank you and enjoy your movie!");
                movie.available = false;
            }
            else
                System.out.println("That movie is not available.");
            return movie.available;
    }

    public static boolean findAndReturnMovie(String title) {
        Movies movie = findMovieByName(title);
        boolean wasAvailableBeforeReturn = false;

        if(movie.available == false) {
            System.out.println("Thank you for returning the movie.");
            movie.available = true;
        }
        else {
            System.out.println("That is not a valid movie to return.");
            wasAvailableBeforeReturn = true;
        }
        return wasAvailableBeforeReturn;
    }
}
