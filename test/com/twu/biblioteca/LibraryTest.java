package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    List<Books> books =  Arrays.asList(new Books("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 1997),
            new Books("Clean Code", "Uncle Bob", 2008));

    @Test
    public void shouldReturnEqualListOfBooks() {
        assertEquals(books.toString(), Library.getBooks());
    }


}

