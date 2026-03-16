package collection;

import java.util.Arrays;

/**
 * Find Longest Element length in a String Array
 * i/p : {Arun, Chandra, Bala, Dhanushraj}
 * o/p: Dhanushraj -> 10
 */
public class LongestElement {

    public static void main(String[] args) {
        String[] arr = {"Arun", "Chandra", "Bala", "Dhanushraj"};

        String s = Arrays.stream(arr)
                .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                .get();

        System.out.println(s);
    }
}