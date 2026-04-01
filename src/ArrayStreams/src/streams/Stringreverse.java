package streams;

import java.util.Arrays;

public class Stringreverse {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");

        int left =0;
        int right = words.length-1;

        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(words));
    }
}
