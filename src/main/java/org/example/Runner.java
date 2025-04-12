package org.example;

import org.example.melody.Chord;
import org.example.melody.MelodyGenerator;

import java.util.List;

public class Runner {
    private final MelodyGenerator generator;

    public Runner() {
        generator = new MelodyGenerator();
    }

    public String run(String input) {
        List<Chord> chords = InputParser.parse(input);
        List<String> melody = generator.generateMelody(chords);
        return String.join(" ", melody);
    }
}
