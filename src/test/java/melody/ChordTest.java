package melody;

import org.example.melody.Chord;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ChordTest {
    @Test
    public void testCreateChord() {
        // Проверяем создание аккорда C
        Chord chordC = new Chord("C");
        assertNotNull(chordC);

        // Проверяем создание аккорда Am
        Chord chordAm = new Chord("Am");
        assertNotNull(chordAm);

        // Проверяем создание аккорда G
        Chord chordG = new Chord("G");
        assertNotNull(chordG);

        // Проверяем создание аккорда F
        Chord chordF = new Chord("F");
        assertNotNull(chordF);
    }

    @Test
    public void testChordC() {
        Chord chord = new Chord("C");
        List<String> notes = chord.getNotes();
        assertEquals(List.of("C", "E", "G"), notes);
    }

    @Test
    public void testChordAm() {
        Chord chord = new Chord("Am");
        List<String> notes = chord.getNotes();
        assertEquals(List.of("A", "C", "E"), notes);
    }

    @Test
    public void testUnknownChordThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Chord("X").getNotes());
    }



}