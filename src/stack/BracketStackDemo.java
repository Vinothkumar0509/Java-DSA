package stack;

import java.util.Stack;

public class BracketStackDemo {

    public static void main(String[] args) {
        String brackets = "{{[[(())]]}}";

        Boolean isValid = validateBrackets(brackets);
        System.out.println(isValid ? "Is Valid" : "Not Valid");
    }

    private static Boolean validateBrackets(String brackets) {
        Stack<Character> bracketStack = new Stack<>();

        for(char c : brackets.toCharArray()) {
            if(c == '{' || c == '[' || c == '(') {
                bracketStack.push(c);
                continue;
            }

            switch (c) {
                case '}':
                    if(!bracketStack.peek().equals('{')) {
                        return false;
                    }

                    bracketStack.pop();
                    break;

                case ')':
                    if(!bracketStack.peek().equals('(')) {
                        return false;
                    }

                    bracketStack.pop();
                    break;

                case ']':
                    if(!bracketStack.peek().equals('[')) {
                        return false;
                    }
                    bracketStack.pop();
                    break;
            }
        }

        if(bracketStack.isEmpty()) {
            return true;
        }

        return false;

    }
}