package practice;

import java.util.Arrays;

public class DsaPractice {
    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,10};
        FLPosition fl = new FLPosition();
        System.out.println(Arrays.toString(fl.flPosition(arr, 6)));
    }
}