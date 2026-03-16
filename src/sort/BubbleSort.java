package sort;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

    public static void main(String[] args) {
        int[] num = {6, 5, 2, 8, 9, 4};  // 2, 4,5,6,8,9

        int temp = 0;
        long startTime = System.currentTimeMillis();
        for(int i=0; i<num.length; i++) {
            for(int j=0; j<num.length-i-1; j++) {
                if(num[j] > num[j+1]) {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }

        System.out.println(System.currentTimeMillis() - startTime+ " ms");

        for(int i: num) {
            System.out.println(i);
        }

    }
}