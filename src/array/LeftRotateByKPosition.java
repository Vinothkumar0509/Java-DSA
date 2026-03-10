package array;

import java.util.Arrays;
/**
 * Rotate An array Ny k Position
 * O(N)
 */

public class LeftRotateByKPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;  // 14+6 =  6
        k = k % arr.length;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }

        int j = 0;

        for (int i = arr.length - k; i < arr.length; i++) {
            arr[i] = temp[j];
            j++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
