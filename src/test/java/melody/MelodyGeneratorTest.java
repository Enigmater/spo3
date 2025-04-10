package melody;

import org.example.melody.Chord;
import org.example.melody.MelodyGenerator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class MelodyGeneratorTest {
    @Test
    public void testCreateMelodyGenerator() {
        MelodyGenerator melodyGenerator = new MelodyGenerator();
        assertNotNull(melodyGenerator);
    }

    @Test
    public void testGenerateNoteFromChord() {
        MelodyGenerator gen = new MelodyGenerator();
        Chord chord = new Chord("C");
        String note = gen.generateNote(chord);
        assertTrue(chord.getNotes().contains(note));
    }
}
