package array;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        System.out.println("Enter the target:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int i = linearSearch(target);
        if(i==-1){
            System.out.println("Target not found");
        }
        else {
            System.out.println("Target found" +i);
        }
    }

    private static int linearSearch(int target) {
        int[] input = {1,3,5,7,9,11,15,17};

        System.out.println(input[7]);//O(N)

        for(int i=0;i<input.length;i++){
            if(target==input[i]){
                return i;
            }
        }
        return -1;
    }
}
