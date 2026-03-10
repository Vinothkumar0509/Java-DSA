package array;

/**
 * Remove duplicates from the sorted Array and return an Array with Sorted
 */
public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] arr = {1,3,3,3,3,7,7,9,9,9,10}; // output {1,3,7,9,10}

        int index = 1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){

                //arr[index++]=arr[i]; shorthand method
                arr[index]=arr[i];
                index++;
            }
        }

        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
