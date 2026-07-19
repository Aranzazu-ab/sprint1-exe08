package level1Test;

import level1.PiValue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PiValueTest {
    @Test
    void shouldReturnPiValue() {
        PiValue pi = () -> 3.1415;
        assertEquals(3.1415, pi.getPiValue(), 0.0001);
    }
}
