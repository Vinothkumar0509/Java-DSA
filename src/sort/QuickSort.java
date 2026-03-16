package sort;

import java.util.Arrays;

/**
 * O(n log n)
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4,3,5,6,7,2,8,9};
        int low = 0;
        int high = arr.length-1;

        quickSort(arr, low, high);


        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {

        int start = low;
        int end = high;

        if(low >= high) {
            return;
        }

        int mid = (start+end) / 2;
        int pivot = arr[mid];

        while(start <= end) {

            while(arr[start] < pivot) {
                start++;
            }

            while(arr[end] > pivot) {
                end--;
            }


            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        quickSort(arr, low, end);   // left Side process
        quickSort(arr, start, high);  // Right Side process
    }
}