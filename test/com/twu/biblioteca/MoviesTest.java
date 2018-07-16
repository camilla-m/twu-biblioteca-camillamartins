package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoviesTest {

    Movies movie = new Movies("Christopher Nolan", "Interstellar", 2014, 10, true);

    @Test
    public void shouldReturnDirectorName() {
        assertEquals("Christopher Nolan", movie.getDirector());
    }

    @Test
    public void shouldReturnYearPublished() {
        assertEquals(2014, movie.getYear());
    }

    @Test
    public void shouldReturnNameBook() {
        assertEquals("Interstellar", movie.getTitle());
    }

    @Test
    public void shouldReturnBooksStringList() {
        assertEquals("Christopher Nolan" + " " + "Interstellar" + " " + 2014 + " " + 10, movie.toString());
    }

    @Test
    public void shouldReturnAvailableBook() {
        assertEquals(true, movie.getAvailability());
    }
}
