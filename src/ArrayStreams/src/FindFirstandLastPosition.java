import java.util.Scanner;

class findFirstandLastPosition{
    public static void main(String[] args) {

        int[] nums= {5,7,7,8,8,10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target:");
        int target = sc.nextInt();

        int firstPosition = firstPosition(nums,target);
        int secondPosition = secondPosition(nums,target);

        int[] result = new int[]{firstPosition, secondPosition};


        if(firstPosition==0 || secondPosition==0){
            System.out.println("Nothing found result[-1,-1]");
        }
         else
        {
            System.out.println(java.util.Arrays.toString(result));
        }
    }

    private static int secondPosition(int[] nums, int target) {
        int high = nums.length-1;
        int low = 0;
        int result = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target==nums[mid]){
                result = mid;
               low = mid+1;
            }
            else if(target<nums[mid]){
                high = mid-1;
            }
            else if(target>nums[mid]){
                low = mid+1;
            }
        }
        return result;
    }

    private static int firstPosition(int[] nums, int target) {
        int high = nums.length-1;
        int low = 0;
        int result = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target==nums[mid]){
                result = mid;
                high = mid-1;
            }
            else if(target<nums[mid]){
               high = mid-1;
            }
            else if(target>nums[mid]){
            low  = mid+1;
            }
        }
        return result;
    }
}