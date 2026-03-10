package array;

import java.util.Scanner;

public class BinarySearch {
    public static boolean binarySearch(int target) {

        int[] input = {1, 3, 5, 7, 9, 11, 15};

        int low = 0;
        int high = input.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == input[mid]) {
                return true;
            } else if (target <= input[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return false;
    }


    public static  void main(String[] args) {
        System.out.println("Enter the target :");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        long startTime = System.currentTimeMillis();
        boolean isFound = binarySearch(target);
        long endTime = System.currentTimeMillis();
        System.out.println(startTime-endTime);
        if(isFound) {
            System.out.println("Target found");
        }
        else  {
            System.out.println("Target not found");
        }
    }
}

