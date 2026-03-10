package array;

public class MaxSubArray {
    //Time Complexity O(N)
    //Finding maximum SubArray Using Kadane's Algorithm
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -1};
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i : arr) {
            sum = sum + i;//sum+=i;

            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

//        for(int i:arr)
//        {
//            System.out.print(1+" ");
//        }
        System.out.println(max);
    }
}
