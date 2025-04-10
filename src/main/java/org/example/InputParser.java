package org.example;

import org.example.melody.Chord;

import java.util.ArrayList;
import java.util.List;

public class InputParser {
    public static List<Chord> parse(String input) {
        String[] names = input.trim().split("\\s+");
        List<Chord> chords = new ArrayList<>();
        for (String name : names) {
            chords.add(new Chord(name));
        }
        return chords;
    }
}

