package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if (map.containsKey(sum)) {
                System.out.println(map.get(sum)+ " " + i);
                System.out.println(sum + " " + nums[i]);
                return;
            }
            map.put(nums[i],i);
        }
    }
    }
