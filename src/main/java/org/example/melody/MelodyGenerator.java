package org.example.melody;

import java.util.List;
import java.util.Random;

public class MelodyGenerator {

    private final Random random;

    public MelodyGenerator() {
        this.random = new Random();
    }

    public String generateNote(Chord chord) {
        List<String> notes = chord.getNotes();
        return notes.get(random.nextInt(notes.size()));
    }
}
