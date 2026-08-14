package DSA.Stack;

import java.util.*;

class InfixToPostfix {

    static int precedence(char ch) {

        if (ch == '^')
            return 3;

        if (ch == '*' || ch == '/' || ch == '%')
            return 2;

        if (ch == '+' || ch == '-')
            return 1;

        return -1;
    }

    static String infixToPostfix(String s) {

        StringBuilder result = new StringBuilder();

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }

            // Opening bracket
            else if (ch == '(') {
                stack.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }

                stack.pop(); // remove '('
            }

            // Operator
            else {

                while (!stack.isEmpty()
                        && stack.peek() != '('
                        && precedence(stack.peek()) >= precedence(ch)) {

                    result.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String expression = "A+B*C";

        System.out.println(infixToPostfix(expression));
    }
}