package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void shouldFindBookByTitle() {
        assertEquals("The Lonely Hearts Club", Library.findBookByName("The Lonely Hearts Club").name);
    }

    @Test
    public void shouldCheckOutBook() {
        assertEquals(false, Library.findAndGetBook("The Lonely Hearts Club"));
    }

    @Test
    public void shouldNotCheckOutBook() {
        assertEquals(false, Library.findAndGetBook("Clean Code"));
    }

    @Test
    public void shouldReturnBook() {
        assertEquals(false, Library.findAndReturnBook("Clean Code"));
    }

    @Test
    public void shouldNotReturnBook() {
        assertEquals(true, Library.findAndReturnBook("Harry Potter and the Philosopher's Stone"));
    }
}


