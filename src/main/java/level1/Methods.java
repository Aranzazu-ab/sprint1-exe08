package level1;

import common.Validation;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static List<String> namesWithLetterO(List<String> names){
        Validation.validateNotNullList(names);
        Validation.validateNoNullElements(names);
        return names.stream()
                .filter(name -> name.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }

    public static List<String> longNamesWithO(List<String> names) {
        Validation.validateNotNullList(names);
        Validation.validateNoNullElements(names);
        return namesWithLetterO(names)
                .stream()
                .filter(name -> name.length() > 5)
                .toList();
    }

    public static void printList(List<String> list) {
        Validation.validateNotNullList(list);
        Validation.validateNoNullElements(list);
        list.forEach(name -> System.out.println(name));
    }

    public static List<String> sortByLength (List<String> list){
        Validation.validateNotNullList(list);
        Validation.validateNoNullElements(list);
        return list.stream()
                .sorted((a,b)-> Integer.compare(a.length(),b.length())).toList();
    }

    public static List<String> sortByLengthDescending(List<String> list){
        Validation.validateNotNullList(list);
        Validation.validateNoNullElements(list);
        return list.stream()
                .sorted((a,b)-> Integer.compare(b.length(),a.length()))
                .collect(Collectors.toList());
    }

    public static String reverseText(String text){
        return new StringBuilder(text).reverse().toString();
    }
}
