package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Can be implemented using -
Array
ArrayList
Linked List
Java Deque / ArrayDeque - Preferred
 */

public class Stack {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek
        System.out.println(stack.peek()); // 30

        // Pop
        System.out.println(stack.pop());  // 30
        System.out.println(stack.pop());  // 20

        // Check empty
        System.out.println(stack.isEmpty()); // false

        // Size
        System.out.println(stack.size()); // 1
    }
}
