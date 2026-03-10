package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUnion {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 4, 5, 8, 9, 9, 10, 10};

        // O(n2)
        Set<Integer> set = new HashSet<>();
        set = usingSetApproach(arr1, arr2, set);

        // O(N)
        List<Integer> unionList = twoPointerAlgo(arr1, arr2);


//        for(int i: set) {
//            System.out.print(i+" ");
//        }

        for (int i : unionList) {
            System.out.print(i + " ");
        }
    }

    private static List<Integer> twoPointerAlgo(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> unionList = new ArrayList<>();

        int n = arr1.length;
        int m = arr2.length;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                    unionList.add(arr1[i]);
                }
                i++;
            } else {
                if (unionList.isEmpty() || !unionList.contains(arr2[j])) {
                    unionList.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                unionList.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]) {
                unionList.add(arr2[j]);
            }
            j++;
        }

        return unionList;

    }


    private static Set<Integer> usingSetApproach(int[] arr1, int[] arr2, Set<Integer> set) {
        for (int i : arr1) {
            set.add(i);
        }

        for (int i : arr2) {
            set.add(i);
        }

        return set;
    }
}