package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    Books book = new Books("Elizabeth Eulberg", "The Lonely Hearts Club", 2010, true);

    @Test
    public void shouldReturnAuthorName() {
        assertEquals("Elizabeth Eulberg", book.getAuthor());
    }

    @Test
    public void shouldReturnYearPublished() {
        assertEquals(2010, book.getYear());
    }

    @Test
    public void shouldReturnNameBook() {
        assertEquals("The Lonely Hearts Club", book.getTitle());
    }

    @Test
    public void shouldReturnBooksStringList() {
        assertEquals("The Lonely Hearts Club" + " " + "Elizabeth Eulberg" + " " + 2010, book.toString());
    }

    @Test
    public void shouldReturnAvailableBook() {
        assertEquals(true, book.getAvailability());
    }
}
