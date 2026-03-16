package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {10, 1, 9,8,2,7};

        insertionSort(arr);

        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }

    private static void insertionSort(int[] arr) {
        for(int i=1; i< arr.length; i++) {
            int temp = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > temp) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = temp;

        }

    }
}