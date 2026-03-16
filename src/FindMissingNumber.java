import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class FindMissingNumber {

    public static void main(String[] args) {
        Stack<Integer> outputStack = new Stack<>();
        int[] arr = {1, 2, 5, 7, 9, 15};

        System.out.println(Arrays.toString(usingArray(arr)));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(8);

        System.out.println(list.size());

        for (int i = 1; i < list.size(); i++) {
            int currentValue = list.get(i);
            int previousValue = list.get(i - 1);
            int counter = 1;
            while (currentValue - previousValue != 1) {
                outputStack.add(previousValue + counter); // 3,4, 5
                counter++;

                if (outputStack.peek() == currentValue) {
                    outputStack.pop();
                    break;
                }
            }
        }

        System.out.println(outputStack);

        List<Integer> newList = outputStack.stream().toList();

        list.addAll(newList);

        System.out.println(list.stream().sorted().toList());

    }


    public static int[] usingArray(int[] inputArr) {
        int opSize = inputArr[inputArr.length - 1];
        int[] opArray = new int[opSize];
        int j = 0;
        for (int i = 1; i < inputArr.length; i++) {
            int currentValue = inputArr[i];
            int previousValue = inputArr[i - 1];
            int counter = 1;
            while (currentValue - previousValue != 1) {
                opArray[j] = previousValue + counter;
                int temp = opArray[j];
                counter++;
                j++;

                if (temp + 1 == currentValue) {
                    break;
                }

            }
        }

        return opArray;

    }
}