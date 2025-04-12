package org.example.melody;

import java.util.List;

public class Chord {
    private final String name;

    /**
     * Конструктор аккорда по имени.
     * @param name название аккорда (например, "C", "Am")
     */
    public Chord(String name) {this.name = name;}

    /**
     * Возвращает список нот, составляющих аккорд.
     * @return список нот аккорда
     */
    public List<String> getNotes() {
        switch (name) {
            case "C": return List.of("C", "E", "G");
            case "Am": return List.of("A", "C", "E");
            case "F" : return List.of("F", "A", "C");
            case "G" : return List.of("G", "B", "D");
            default: throw new IllegalArgumentException("Unknown chord: " + name);
        }
    }

    public String getName() {
        return name;
    }
}
