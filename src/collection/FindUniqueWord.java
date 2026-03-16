package collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find Unique word and print in Alphabetical order as List
 * String s = "Java is Powerful and Java is Oops based language"
 * o/p : Java is Powerful and Oops based language
 */
public class FindUniqueWord {
    public static void main(String[] args) {
        String str = "Java is Powerful and java is Oops based language";

        List<String> output = Arrays.stream(str.split(" "))
                .map((s) -> s.toLowerCase())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        output.stream().forEach(s -> System.out.print(s+", "));


    }
}