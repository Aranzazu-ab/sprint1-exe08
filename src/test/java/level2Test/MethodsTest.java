package level2Test;

import level2.Methods;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodsTest {
    @ParameterizedTest
    @CsvSource({
            "Amy,true",
            "Ada,true",
            "Anna,false",
            "Alex,false",
            "Bob,false",
            "Aaron,false"
    })
    void shouldReturnOnlyNamesStartingWithAAndThreeLetters(String name, boolean expected) {
        List<String> result = Methods.namesStartingWithA(List.of(name));
        assertEquals(expected, !result.isEmpty());
    }

    @Test
    void shouldConvertNumbersToEvenOrOddString() {
        List<Integer> numbers = List.of(3, 55, 44);
        String expected = "o3,o55,e44";
        assertEquals(expected, Methods.evenOrOdd(numbers));
    }

    @Test
    void shouldSortStringsByFirstCharacter() {
        List<String> values = List.of(
                "banana",
                "apple",
                "cat"
        );

        List<String> expected = List.of(
                "apple",
                "banana",
                "cat"
        );
        assertEquals(expected,
                Methods.sortByFirstCharacter(values));
    }

    @Test
    void shouldPlaceStringsContainingEBeforeOthers() {
        List<String> values = List.of(
                "banana",
                "desk",
                "cat",
                "elephant"
        );
        List<String> expected = List.of(
                "desk",
                "elephant",
                "banana",
                "cat"
        );
        assertEquals(expected,
                Methods.stringsContainingE(values));

    }

    @Test
    void shouldReplaceLetterAWithNumberFour() {
        List<String> values = List.of(
                "banana",
                "cat",
                "desk"
        );
        List<String> expected = List.of(
                "b4n4n4",
                "c4t",
                "desk"
        );
        assertEquals(expected,
                Methods.replaceA(values));
    }

    @Test
    void shouldReturnOnlyNumericStrings() {
        List<String> values = List.of(
                "12",
                "apple",
                "7",
                "desk",
                "100"
        );

        List<String> expected = List.of(
                "12",
                "7",
                "100"
        );
        assertEquals(expected,
                Methods.numericStrings(values));

    }
}
