package com.twu.biblioteca;

public class Rating {

    public static int defineNotes(int note) {
        if(note >= 1 && note <= 10)
            return note;
        return 0;
    }
}
