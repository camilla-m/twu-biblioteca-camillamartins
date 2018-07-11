package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Books bookNotAvailable = new Books("Uncle Bob", "Clean Code", 2008, false);
    Books bookAvailable = new Books("Elizabeth Eulberg", "The Lonely Hearts Club", 2010, true);
    Books bookNotChecked = new Books("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 1997, true);

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


