package bitwise;

public class BitWiseProgram {
    //&,|,^,`
    //Shift ----> >>,<<

    public static void main(String[] args) {
        int a =9;
        int b =12;

        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);

        int num = 4;
        int leftShift = 3;
        int rightShift = 1;

        System.out.println(num << leftShift);
        System.out.println(num >> rightShift);

    }
}
