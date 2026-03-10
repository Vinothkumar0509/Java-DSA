package array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveNumbers {
    public static void main(String[] args) {
        int[] arr = {200, 100, 1, 2, 3, 4};

        int finalLength = findConsecutive(arr);

        System.out.println(finalLength);
    }

    private static int findConsecutive(int[] arr) {
        int size = arr.length;
        Set<Integer> set = new HashSet<>();
        int longest = 0;

        if(size == 0) {
            throw new RuntimeException("Invalid Inputs");
        }

        for(int i : arr) {
            set.add(i);
        }

        for(int num : set) {
            if(!set.contains(num -1)) {
                int count = 1;
                int it = num;
                while(set.contains(it+1)) {
                    it= it+1;
                    count= count+1;
                }
                longest = Math.max(count, longest);

            }
        }

        return longest;
    }
}
