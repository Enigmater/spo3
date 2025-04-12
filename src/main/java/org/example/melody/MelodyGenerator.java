package org.example.melody;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MelodyGenerator {

    private final Random random;

    /**
     * Конструктор по умолчанию, инициализирует генератор с произвольным seed.
     */
    public MelodyGenerator() {
        this.random = new Random();
    }

    public String generateNote(Chord chord) {
        List<String> notes = chord.getNotes();
        return notes.get(random.nextInt(notes.size()));
    }

    public List<String> generateMelody(List<Chord> chords) {
        List<String> melody = new ArrayList<>();
        for (Chord chord : chords) {
            melody.add(generateNote(chord));
        }
        return melody;
    }
}
