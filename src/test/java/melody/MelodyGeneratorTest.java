package melody;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MelodyGeneratorTest {
    @Test
    public void testCreateMelodyGenerator() {
        MelodyGenerator melodyGenerator = new MelodyGenerator();
        assertNotNull(melodyGenerator);
    }
}
