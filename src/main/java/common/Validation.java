package common;

import java.util.List;
import java.util.Objects;

public class Validation {
    public static <T> void validateNotNullList(List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("The list cannot be null.");
        }
    }

    public static <T> void validateNoNullElements(List<T> list) {
        validateNotNullList(list);
        if (list.stream().anyMatch(Objects::isNull)) {
            throw new IllegalArgumentException("The list cannot contain null elements.");
        }
    }
}
