package streams;

import java.util.*;



public class SecondHighest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = 5;
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Integer result = Arrays.stream(arr)
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .get();


        if(result == null) {
            System.out.println("No Second Highest;" + result);
        } else {
            System.out.println("Second Highest:" + result);
        }
       }
    }




