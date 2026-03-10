package array;

import java.util.HashMap;
import java.util.Map;

public class PrefixSumDemo
/**
 * Find sub array count to which sums satisfies the target
 */{
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,0,-3,3};  // {1,3,5,2,4}
        int target = 3;

        int output = getCountOfSubArray(arr, target);

        System.out.println(output);

    }

    private static int getCountOfSubArray(int[] arr, int target) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        freqMap.put(0,1);


        int prefixSum = 0;
        int count = 0;
        for(int num : arr) {    // {1,2,3,1,2,0,-3,3}
            prefixSum += num;

            if (freqMap.containsKey(prefixSum - target)) {
                count += freqMap.get(prefixSum - target);  // 2+1 = 3
            }

            freqMap.put(prefixSum, freqMap.getOrDefault(prefixSum, 0)+1);

        }

        return count;
    }
}
