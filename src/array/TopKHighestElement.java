package array;

import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;

public class TopKHighestElement {

    public static void main(String[] args) {
        int[] arr = {2, 1, 1000, 5, 3, 100, 4, 67};
        int k = 2;
        //int op = sortingBasedApproach(arr, k);
//        System.out.println(op);

        int output = optimizedApproach(arr, k);
        System.out.println(output);

    }

    //O(N)
    public static int optimizedApproach(int[] arr, int k) {
        PriorityQueue<Integer> MIN_HEAP = new PriorityQueue<>();
        PriorityQueue<Integer> MAX_HEAP = new PriorityQueue<>((a, b) -> b - a);

        for (int i : arr) {
            if (MIN_HEAP.size() < k || i > MIN_HEAP.peek()) {
                MIN_HEAP.add(i);
            }

            if (MIN_HEAP.size() > k) {
                MIN_HEAP.poll();
            }

        }
        return Objects.nonNull(MIN_HEAP.peek()) ? MIN_HEAP.peek() : 0;
    }

    // O(N Log N)
    private static int sortingBasedApproach(int[] arr, int k) {
        Arrays.sort(arr);  // [1,2,3,5,10]  // O(n logn)
        int op = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (k == i - 1) {
                return arr[i];
            }
        }

        return 0;
    }
}
