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

}
