import org.example.InputParser;
import org.example.melody.Chord;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class InputParserTest {
    @Test
    public void testParseSingleChord() {
        String input = "C";
        List<Chord> chords = InputParser.parse(input);
        assertEquals("Should parse one chord", 1, chords.size());
        assertEquals("The chord should be C", "C", chords.get(0).getName());
    }

    @Test
    public void testParseMultipleChords() {
        String input = "C Am G F";
        List<Chord> chords = InputParser.parse(input);
        assertEquals( "Should parse four chords", 4, chords.size());
        assertEquals("The first chord should be C", "C", chords.get(0).getName());
        assertEquals("The second chord should be Am", "Am", chords.get(1).getName());
        assertEquals("The third chord should be G", "G", chords.get(2).getName());
        assertEquals("The fourth chord should be F", "F", chords.get(3).getName());
    }
}
