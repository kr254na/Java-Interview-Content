package DSA.Stack;

import java.util.*;

class PostfixEvaluation {

    static int evaluate(String expression) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (char ch : expression.toCharArray()) {

            // Operand
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }

            // Operator
            else {

                int b = stack.pop();
                int a = stack.pop();

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

        String expression = "234*+";

        System.out.println(evaluate(expression));
    }
}
