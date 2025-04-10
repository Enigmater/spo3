package melody;

import org.example.melody.Chord;
import org.example.melody.MelodyGenerator;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

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

    @Test
    public void testGenerateMelodyMatchesChordCount() {
        MelodyGenerator gen = new MelodyGenerator();
        List<Chord> chords = List.of(new Chord("C"), new Chord("G"), new Chord("Am"), new Chord("F"));
        List<String> melody = gen.generateMelody(chords);
        assertEquals(4, melody.size());
    }
}
