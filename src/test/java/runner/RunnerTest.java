package runner;

import org.example.runner.Runner;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {
    @Test
    public void testCreateRunner() {
        Runner melodyRunner = new Runner();
        assertNotNull(melodyRunner);
    }

    @Test
    public void testRunGeneratesExpectedLengthMelody() {
        Runner melodyRunner = new Runner();
        String result = melodyRunner.run("C G Am");
        String[] notes = result.split(" ");
        assertEquals(3, notes.length);
    }

    @Test
    public void testRunWithInvalidChordThrowsException() {
        Runner melodyRunner = new Runner();
        assertThrows(IllegalArgumentException.class, () -> melodyRunner.run("X Y Z"));
    }
}
