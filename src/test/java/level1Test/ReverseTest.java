package level1Test;

import level1.Reverse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {
    @Test
    void shouldReverseString() {
        Reverse reverse =
                text -> new StringBuilder(text).reverse().toString();
        assertEquals(
                "adbmaL",
                reverse.reverse("Lambda")
        );
    }
}
