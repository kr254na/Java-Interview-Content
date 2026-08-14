package DSA.Stack;

import java.util.*;

class PrefixEvaluation {

    static int evaluate(String expression) {

        Deque<Integer> stack = new ArrayDeque<>();

        // Scan from right to left
        for (int i = expression.length() - 1; i >= 0; i--) {

            char ch = expression.charAt(i);

            // Operand
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }

            // Operator
            else {

                int a = stack.pop();
                int b = stack.pop();

                int result;

                switch (ch) {

                    case '+':
                        result = a + b;
                        break;

                    case '-':
                        result = a - b;
                        break;

                    case '*':
                        result = a * b;
                        break;

                    case '/':
                        result = a / b;
                        break;

                    default:
                        throw new IllegalArgumentException(
                                "Invalid operator"
                        );
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String expression = "+2*34";

        System.out.println(evaluate(expression));
    }
}