package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTests {

    @Test
    public void shouldReturnWelcomeMessage() {
        assertEquals("Welcome to Biblioteca!", BibliotecaApp.welcomeMessage());
    }
}


