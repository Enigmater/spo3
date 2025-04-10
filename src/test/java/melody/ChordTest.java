package melody;

import org.example.melody.Chord;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

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
}