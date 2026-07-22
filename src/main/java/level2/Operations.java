package level2;

public class Operations {
    static Operation addition = (a, b) -> a + b;
    static Operation subtraction = (a, b) -> a - b;
    static Operation multiplication = (a, b) -> a * b;
    static Operation division = (a, b) -> a / b;

    public static float calculate(float a, float b, Operation operation) {
        return operation.operation(a, b);
    }
}
