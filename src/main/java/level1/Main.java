package level1;

import java.util.Arrays;
import java.util.List;
import static level1.Methods.*;

public class Main {
    public static void main (String[]args){
        List<String> names = Arrays.asList(
                "Alvaro", "Ona", "Lucia", "Juan","Francisco", "Monica", "Sonia","Carlos","Alexa","Estefania"
        );

        List<String> months = Arrays.asList(
                "January","February","March","April","May","June","July","August","September","October","November","December"
        );

        System.out.println("Names list with letter 'O': ");
        printList(namesWithLetterO(names));
        System.out.println("********************************");
        System.out.println("Names list with 'O' and more than 5 letters: ");
        printList(longNamesWithO(names));
        System.out.println("********************************");
        System.out.println("Months of the year print with lambda method: ");
        months.forEach(month-> System.out.println(month));
        System.out.println("********************************");
        System.out.println("Months of the year print with method reference: ");
        months.forEach(System.out::println);

        PiValue pi = () -> 3.1415;
        System.out.println("Print Pi value returned by a functional interface: ");
        System.out.println(pi.getPiValue());
        System.out.println("********************************");

        List<String> numbersAndWords =Arrays.asList(
                "Yellow", "200","Blue","2", "8", "Orange","Purple", "15648","Transparent","Green"
        );

        System.out.println("List sorted by length, from shortest to longest: ");
        printList(sortByLength(numbersAndWords));
        System.out.println("********************************");
        System.out.println("List sorted by length, from shortest to longest: ");
        printList(sortByLengthDescending(numbersAndWords));

        System.out.println("********************************");
        System.out.println("String with reverse method: ");
        Reverse reverseText = text -> new StringBuilder(text).reverse().toString();
        System.out.println(reverseText.reverse("String"));
    }
}
