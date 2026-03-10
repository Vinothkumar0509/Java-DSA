package array;

import java.util.HashMap;
import java.util.Map;


public class LongestSubString
/**
 * Sliding Window Algorithm
 * <p>
 * {a,b,c,d,a,b,c} -> op = 4, Exp: [abcd] -> length - 4
 */{
     public static void main(String[] args) {
        String s = "abcdabc";

        System.out.println(longestSubString(s));

    }

        private static int longestSubString(String s) {
            Map<Character, Integer> subStringMap = new HashMap<>();

            int left = 0;
            int maxLength = 0;

            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);

                if (subStringMap.containsKey(c)) {
                    left = Math.max(left, subStringMap.get(c) + 1);  // (0,1)  // abcdabc
                }

                subStringMap.put(c, right);  // a -> 0 , a -> 4

                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }
}
