package commonTest;

import common.Validation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidationTest {
    @Test
    void shouldThrowExceptionWhenListIsNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Validation.validateNotNullList(null)
        );
    }

    @Test
    void shouldThrowExceptionWhenListContainsNullElement() {
        List<String> list = Arrays.asList(
                "Anna",
                null,
                "Bob"
        );
        assertThrows(
                IllegalArgumentException.class,
                () -> Validation.validateNoNullElements(list)
        );
    }
}
