package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 *
 * Output: [1,2]
 *
 * Example 2:
 *
 * Input: nums = [1], k = 1
 *
 * Output: [1]
 *
 * Example 3:
 *
 * Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
 *
 * Output: [1,2]
 *
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 */
public class TopKFrequentElement {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,2,5,5,5,6,9};

        int k = 2;

        // Step 1
        Map<Integer, Integer> freqMap = new HashMap<>();


        // Creating key value pair
        for(int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        List[] bucket = new List[arr.length];

        freqMap.forEach((data, index) -> {  // (k,v) -> {}
            if(bucket[index] == null) {
                bucket[index] = new ArrayList<>();
            }
            bucket[index].add(data);
        });

        // using normal For - loop use if you have doubt in forEach

//        for(Map.Entry<Integer, Integer> map : freqMap.entrySet()) {
//            if(bucket[map.getValue()] == null) {
//                bucket[map.getValue()] = new ArrayList();
//            }
//            bucket[map.getValue()].add(map.getKey());
//        }

        List<Integer> result = new ArrayList<>();
        for(int i = bucket.length-1; i> 0 && result.size() < k; i--) {
            if(bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }

        if(result.size() > 2) {
            System.out.println(result.stream().limit(2).toList());
        }



    }
}