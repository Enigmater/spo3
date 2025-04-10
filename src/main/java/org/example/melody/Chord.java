package org.example.melody;

import java.util.List;

public class Chord {
    private final String name;

    public Chord(String name) {this.name = name;}

    public List<String> getNotes() {
        switch (name) {
            case "C": return List.of("C", "E", "G");
            case "Am": return List.of("A", "C", "E");
            default: throw new IllegalArgumentException("Unknown chord: " + name);
        }
    }
}
