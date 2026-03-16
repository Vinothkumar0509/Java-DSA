package map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find First Non repeat character
 */
public class NonRepeatCharacter {

    public static void main(String[] args) {
        String name = "aruna";

        Map<String, Long> countMap = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(countMap);


        Map.Entry<String, Long> first = countMap.entrySet().stream()
                .filter((entry) -> entry.getValue() == 1)
                .findFirst().orElse(null);

        System.out.println(first.getKey());
    }
}