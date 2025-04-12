package org.example;

import org.example.melody.Chord;
import org.example.melody.MelodyGenerator;

import java.util.List;

public class Runner {
    private final MelodyGenerator generator;

    /**
     * Конструктор по умолчанию, инициализирует генератор мелодий без фиксированного зерна.
     */
    public Runner() {
        generator = new MelodyGenerator();
    }

    /**
     * Запускает генерацию мелодии на основе строки аккордов.
     * @param input строка аккордов, разделённых пробелами (например: "C G Am")
     * @return сгенерированная мелодия в виде строки нот, разделённых пробелами
     */
    public String run(String input) {
        List<Chord> chords = InputParser.parse(input);
        List<String> melody = generator.generateMelody(chords);
        return String.join(" ", melody);
    }
}
