package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RatingTest {
    @Test
    public void shouldRatingBetween1and10() {
        assertEquals(10, Rating.defineNotes(10));
    }

    @Test
    public void shouldReturn0IfOutOfRange() {
        assertEquals(0, Rating.defineNotes(15));
    }
}
