package map;

import java.util.*;

/**
 * Concurrent Hashmap -> Map<Object, Object> map = new ConcurrentHashMap<>();
 * Synchronized HashMap -> Collections.synchronizedMap(studentMap);
 */

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("Arun", 10);
        studentMap.put("Bala", 7);
        studentMap.put("Chandra", 9);

        System.out.println(studentMap);
        System.out.println(studentMap.size());

        System.out.println(studentMap.get("Bala"));

        studentMap.remove("Arun");

        System.out.println(studentMap.containsKey("Chandra"));
        System.out.println(studentMap.containsValue(7));

        System.out.println("After removing");
        System.out.println(studentMap);

    }
}