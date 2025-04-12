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

    /**
     * Генерирует одну случайную ноту из указанного аккорда.
     * @param chord аккорд
     * @return одна из нот этого аккорда
     */
    public String generateNote(Chord chord) {
        List<String> notes = chord.getNotes();
        return notes.get(random.nextInt(notes.size()));
    }

    /**
     * Генерирует мелодию по списку аккордов.
     * @param chords список аккордов
     * @return список нот, по одной на каждый аккорд
     */
    public List<String> generateMelody(List<Chord> chords) {
        List<String> melody = new ArrayList<>();
        for (Chord chord : chords) {
            melody.add(generateNote(chord));
        }
        return melody;
    }
}
