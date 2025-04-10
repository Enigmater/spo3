package org.example.melody;

import java.util.List;

public class Chord {
    private final String name;

    public Chord(String name) {this.name = name;}

    public List<String> getNotes() {
        if (name.equals("C")) {
            return List.of("C", "E", "G");
        }
        throw new IllegalArgumentException("Unknown chord: " + name);
    }
}
