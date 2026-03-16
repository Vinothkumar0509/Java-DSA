package string;

import java.util.Objects;

public class StringProgram {

    public static void main(String[] args) {

        String a = "exampleA";
        System.out.println(System.identityHashCode(a));  // 1705736037
        String b = "exampleA";
        System.out.println(System.identityHashCode(b)); // 1705736037

        b = "exampleB";
        System.out.println(System.identityHashCode(b));


        String objectType = new String("exampleA");
        System.out.println(System.identityHashCode(objectType));


        String inputFromGFG = new String("cricket");

        String dataBase = "cricket";
        String s2 = inputFromGFG;

        System.out.println(dataBase == s2);
        System.out.println(dataBase.equals(s2));

        StringBuffer buffer = new StringBuffer();  // threadSafe

        for(int i = 0; i< 10; i++) {
            buffer = buffer.append(dataBase+i);
            System.out.println(buffer);
            System.out.println(System.identityHashCode(buffer));
        }

    }

}