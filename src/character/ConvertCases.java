package character;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ConvertCases {

    public static void main(String[] args) {
        String lowerCase = "hEllo";  // HELLO
        String output = "";


        for(char c : lowerCase.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                c =  (char)(c ^ 32);  // c - 32
            }
            output += c;
        }

        // using Streams
        String collect = lowerCase.chars()
                .mapToObj(c -> {
                    char ch = (char) c;
                    if (ch >= 'a' && ch <= 'z') {
                        ch = (char) (ch - 32);  // c - 32
                    }

                    return String.valueOf(ch);
                })
                .collect(Collectors.joining(""));

        System.out.println(collect);


        // convert char to lowerCase
        char c = 'A'; // a
        char lowerCharacter = (char) (c + 32);
        System.out.println(lowerCharacter);

    }
}