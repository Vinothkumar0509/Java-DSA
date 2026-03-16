package stack;


public class StackImpl {

    private int[] array;
    private int top;

    public StackImpl(int capacity) {
        array = new int[capacity];
        top = -1;
    }

    public boolean push(int val) {

        if(isFull()) {
            return false;
        }

        //        ++top;
        array[++top] = val;

        return true;

    }

    public int pop() {
        if(isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return array[top--];

    }

    public int peek() {
        if(isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return array[top];
    }


    public boolean isEmpty() {  // -1
        return top < 0;
    }

    private boolean isFull() {
//        if(top >= array.length-1) {
//            return true;
//        }

        return top >= array.length - 1;


    }




}