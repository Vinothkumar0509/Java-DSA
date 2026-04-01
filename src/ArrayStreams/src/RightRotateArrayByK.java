import java.util.Arrays;
import java.util.Scanner;

public class RightRotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the k element:");
        int k = input.nextInt();

        int[] temp = new int[k];
        for(int i =0;i<k;i++)
        {
            temp[i] = arr[arr.length-k+i];
        }

        for(int i=arr.length-1;i>=k;i--)
        {
            arr[i]= arr[i-k];
        }

        int j =0;
        for(int i =0;i<k;i++)
        {
            arr[i] = temp[j];
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
