package numbers;

public class Palindrome {

    public static void main(String[] args) {

        int num = 12321;
        int temp = num;
        int rev = 0;
        int remainder;

        while (num != 0) {
            remainder = num % 10;
            rev = rev * 10 + remainder;   // 12321
            num = num / 10;
            //        num /= 10;
        }

        System.out.println(num);

        if(rev == temp) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}