package level2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Amy",
                "Juan",
                "Alexa",
                "Ana",
                "Brandon",
                "Alejandro",
                "Tomas",
                "Ada",
                "Luis",
                "Eva"
        );

        System.out.println("Names starting with 'A' and having exactly 3 letters:");
        Methods.printList(
                Methods.namesStartingWithA(names)
        );
        System.out.println("****************************************");

        List<Integer> numbers = Arrays.asList(
                3,55,44,18,7,20
        );
        System.out.println("Even and odd numbers:");
        System.out.println(
                Methods.evenOrOdd(numbers)
        );
        System.out.println("****************************************");

        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> a / b;
        System.out.println("Operations by interface: 20 , 2");
        System.out.println("Addition: " +
                addition.operation(20, 2));
        System.out.println("Subtraction: " +
                subtraction.operation(20, 2));
        System.out.println("Multiplication: " +
                multiplication.operation(20, 2));
        System.out.println("Division: " +
                division.operation(20, 2));
        System.out.println("****************************************");

        List<String> stringsAndNumbers = Arrays.asList(
                "apple",
                "42",
                "banana",
                "100",
                "orange",
                "pomegranate",
                "7",
                "watermelon",
                "pear",
                "156465"
        );

        System.out.println("List sorted by first character:");
        Methods.printList(
                Methods.sortByFirstCharacter(stringsAndNumbers)
        );
        System.out.println("****************************************");

        System.out.println("Strings that containing 'e' first:");
        Methods.printList(
                Methods.stringsContainingE(stringsAndNumbers)
        );
        System.out.println("****************************************");

        System.out.println("Replace letters 'a' with '4': ");
        Methods.printList(
                Methods.replaceA(stringsAndNumbers)
        );
        System.out.println("****************************************");

        System.out.println("Show only numeric strings:");
        Methods.printList(
                Methods.numericStrings(stringsAndNumbers)
        );
    }

}
