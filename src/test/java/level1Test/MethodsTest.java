package level1Test;

import level1.Methods;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodsTest {
    @ParameterizedTest
    @CsvSource({
            "Omar,true",
            "Laura,false",
            "Monica,true",
            "Emma,false",
            "Carlos,true",
            "Paula,false"
    })
    void shouldReturnOnlyNamesContainingLetterO(String name, boolean expected) {
        List<String> result = Methods.namesWithLetterO(List.of(name));
        assertEquals(expected, !result.isEmpty());
    }

    @ParameterizedTest
    @CsvSource({
            "John,false",
            "Monica,true",
            "Federico,true",
            "Tom,false",
            "Carlos,true",
            "Hortencia,true",
            "Noa,false"
    })
    void shouldReturnOnlyLongNamesContainingLetterO(String name, boolean expected) {
        List<String> result = Methods.longNamesWithO(List.of(name));
        assertEquals(expected, !result.isEmpty());
    }

    @Test
    void shouldSortStringsFromShortestToLongest() {
        List<String> values = Arrays.asList(
                "Elephant",
                "25",
                "Camel",
                "8"
        );
        List<String> expected = Arrays.asList(
                "8",
                "25",
                "Camel",
                "Elephant"
        );
        assertEquals(expected, Methods.sortByLength(values));
    }


}
