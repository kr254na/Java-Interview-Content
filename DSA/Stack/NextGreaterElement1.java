package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/*
Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 */

// Duplicates not allowed
// Monotonic Stack

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(nums2[0]);
        for(int i=1;i<nums2.length;i++) {
            while(!stack.isEmpty() && stack.peek()<nums2[i]) {
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++) {
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}