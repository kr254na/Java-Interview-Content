package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

// Sentinel Approach

public class SumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        long MOD = 1_000_000_007L;
        long ans = 0;
        for(int i=0;i<=arr.length;i++) {
            int current = i==arr.length?Integer.MIN_VALUE:arr[i];
            while (!stack.isEmpty()
                    && arr[stack.peek()] > current) {

                int mid = stack.pop();

                int left = stack.isEmpty()
                        ? -1
                        : stack.peek();

                int leftChoices = mid - left;
                int rightChoices = i - mid;

                ans += (long) arr[mid]
                        * leftChoices
                        * rightChoices;

                ans %= MOD;
            }
            if (i < arr.length) {
                stack.push(i);
            }
        }
        return (int) ans;
    }
}
