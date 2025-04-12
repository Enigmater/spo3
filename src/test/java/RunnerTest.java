import org.example.Runner;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RunnerTest {
    @Test
    public void testCreateRunner() {
        Runner melodyRunner = new Runner();
        assertNotNull(melodyRunner);
    }
}
