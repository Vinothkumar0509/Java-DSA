package string;

public class Palindrome {

    public static void main(String[] args) {

        String a = "Amma";


        boolean isPalindrome = checkPalindrome(a);

        // Enhanced if loop
        String message = isPalindrome ? "This is palindrome" : "This is Not a palindrome";

//        if(isPalindrome && true) {
//            message = "This is palindrome";
//
//        } else {
//            message = "This is Not a palindrome";
//        }
        System.out.println(message);

    }

    private static boolean checkPalindrome(String a) {
        a = a.toLowerCase();
        a.replace('A', 'S');
        int left = 0;
        int right = a.length()-1;

        while(left < right) {
            if(a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}