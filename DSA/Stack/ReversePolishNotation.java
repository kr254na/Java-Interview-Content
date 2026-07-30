package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String c : tokens) {
            if (!c.equals("+") &&
                    !c.equals("-") &&
                    !c.equals("*") &&
                    !c.equals("/")) {
                stack.push(Integer.parseInt(c));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                if (c.equals("+")) {
                    stack.push(a + b);
                } else if (c.equals("-")) {
                    stack.push(b - a);
                } else if (c.equals("*")) {
                    stack.push(a * b);
                } else {
                    stack.push(b / a);
                }
            }
        }
        return stack.peek();
    }
}
