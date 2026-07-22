package level2;

import java.util.Arrays;
import java.util.List;

import static level2.Operations.calculate;

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

        System.out.println("Operations by interface: 20 , 2");
        System.out.println("Addition 20 + 2: "+calculate(20,2, Operations.addition));
        System.out.println("Substraction 20 - 2: "+calculate(20,2, Operations.subtraction));
        System.out.println("Multiplication 20 * 2: "+calculate(20,2, Operations.multiplication));
        System.out.println("Division 20/2: "+calculate(20,2, Operations.division));
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
                Methods.sortedFirstContainingE(stringsAndNumbers)
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
