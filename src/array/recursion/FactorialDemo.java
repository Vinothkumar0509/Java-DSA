package array.recursion;

public class FactorialDemo {

    public static void main(String[] args) {
        int num =5;
        int result = calculateFactorial(num);
        System.out.println(result);
    }

    private static int calculateFactorial(int num) {
        if(num==1){
            return 1;
        }
        return num*calculateFactorial(num-1);
    }
}
