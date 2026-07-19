package level2;

import common.Validation;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static List<String> namesStartingWithA(List<String> names) {
        Validation.validateNotNullList(names);
        Validation.validateNoNullElements(names);
        return names.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3)
                .collect(Collectors.toList());
    }

    public static String evenOrOdd(List<Integer> numbers){
        Validation.validateNotNullList(numbers);
        Validation.validateNoNullElements(numbers);
        return numbers.stream()
                .map(number -> number % 2 == 0 ? "e" + number: "o" + number)
                .collect(Collectors.joining(","));
    }

    public static List<String> sortByFirstCharacter(List<String> values) {
        Validation.validateNotNullList(values);
        Validation.validateNoNullElements(values);
        return values.stream()
                .sorted((a, b) -> Character.compare(a.charAt(0), b.charAt(0)))
                .collect(Collectors.toList());
    }

    public static List<String> stringsContainingE(List<String> values) {
        Validation.validateNotNullList(values);
        Validation.validateNoNullElements(values);
        return values.stream()
                .sorted((a, b) -> {
                    boolean firstContainsE = a.contains("e");
                    boolean secondContainsE = b.contains("e");
                    if (firstContainsE == secondContainsE) {
                        return 0;
                    }
                    return firstContainsE ? -1 : 1;
                })
                .toList();
    }

    public static List<String> replaceA(List<String> values) {
        Validation.validateNotNullList(values);
        Validation.validateNoNullElements(values);
        return values.stream()
                .map(value -> value.replace("a", "4"))
                .collect(Collectors.toList());

    }

    public static List<String> numericStrings(List<String> values) {
        Validation.validateNotNullList(values);
        Validation.validateNoNullElements(values);
        return values.stream()
                .filter(value -> value.matches("\\d+"))
                .collect(Collectors.toList());
    }

    public static void printList(List<String> list) {
        Validation.validateNotNullList(list);
        Validation.validateNoNullElements(list);
        list.forEach(name -> System.out.println(name));
    }
}
