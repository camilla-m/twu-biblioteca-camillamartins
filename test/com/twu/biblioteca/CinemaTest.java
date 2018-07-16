package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CinemaTest {

    @Test
    public void shouldFindMovieByTitle() {
        assertEquals("Interstellar", Cinema.findMovieByName("Interstellar").name);
    }

    @Test
    public void shouldCheckOutMovie() {
        assertEquals(false, Cinema.findAndGetMovie("Interstellar"));
    }

    @Test
    public void shouldNotCheckOutMovie() {
            assertEquals(false, Cinema.findAndGetMovie("X-Men"));
    }

    @Test
    public void shouldReturnBook() {
        assertEquals(false, Cinema.findAndReturnMovie("X-Men"));
    }

    @Test
    public void shouldNotReturnBook() {
        assertEquals(true, Cinema.findAndReturnMovie("Thelma & Louise"));
    }
}


