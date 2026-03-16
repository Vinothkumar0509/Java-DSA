package practice;

public class FLPosition {

    public FLPosition() {}

    public int firstOccurrence(int[] arr, int t){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high ){
            int mid = (low+high)/2;

            if(arr[mid] >= t){
                high = mid-1;
            }else{
                low = mid+1;
            }

            if(arr[mid] == t){
                ans = mid;
            }
        }
        return ans;
    }

    public int lastOccurrence(int[] arr, int t){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high ){
            int mid = (low+high)/2;


            if(arr[mid] > t){
                high = mid-1;
            }else{
                low = mid+1;
            }

            if(arr[mid] == t){
                ans = mid;
            }
        }
        return ans;
    }



    public int[] flPosition(int[] arr, int target){
        int n = arr.length;
        int first = -1;
        int last = -1;

        if(n == 0) return new int[]{first, last};

        first = firstOccurrence(arr, target);
        last = lastOccurrence(arr, target);


        return new int[]{first, last};
    }
}