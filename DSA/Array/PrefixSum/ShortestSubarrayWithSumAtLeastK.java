package DSA.Array.PrefixSum;

import java.util.ArrayDeque;
import java.util.Deque;

class ShortestSubarrayWithSumAtLeastK {
    public int shortestSubarray(int[] nums, int k) {

        int n = nums.length;

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        Deque<Integer> dq = new ArrayDeque<>();

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {

            while (!dq.isEmpty() &&
                    prefix[i] - prefix[dq.peekFirst()] >= k) {

                ans = Math.min(ans, i - dq.pollFirst());
            }

            while (!dq.isEmpty() &&
                    prefix[i] <= prefix[dq.peekLast()]) {

                dq.pollLast();
            }

            dq.offerLast(i);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}