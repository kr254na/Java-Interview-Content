package DSA.Stack;

import java.util.*;

class InfixToPrefix {

    static int precedence(char ch) {

        if (ch == '^')
            return 3;

        if (ch == '*' || ch == '/' || ch == '%')
            return 2;

        if (ch == '+' || ch == '-')
            return 1;

        return -1;
    }

    static String infixToPrefix(String s) {

        // Step 1: Reverse the string
        StringBuilder reversed = new StringBuilder(s).reverse();

        // Step 2: Swap parentheses
        for (int i = 0; i < reversed.length(); i++) {

            if (reversed.charAt(i) == '(') {
                reversed.setCharAt(i, ')');
            }
            else if (reversed.charAt(i) == ')') {
                reversed.setCharAt(i, '(');
            }
        }

        // Step 3: Convert reversed expression to postfix
        StringBuilder postfix = new StringBuilder();

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : reversed.toString().toCharArray()) {

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }

            // Opening bracket
            else if (ch == '(') {
                stack.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }

                stack.pop();
            }

            // Operator
            else {

                while (!stack.isEmpty()
                        && stack.peek() != '('
                        && precedence(stack.peek()) > precedence(ch)) {

                    postfix.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        // Step 4: Reverse postfix
        return postfix.reverse().toString();
    }

    public static void main(String[] args) {

        String expression = "(A+B)*C";

        System.out.println(infixToPrefix(expression));
    }
}