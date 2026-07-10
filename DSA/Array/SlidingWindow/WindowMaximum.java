package DSA.Array.SlidingWindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
Given:
nums = [1,3,-1,-3,5,3,6,7]
k = 3
Find maximum of every subarray of size k.
 */
public class WindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        List<Integer> result = new ArrayList<>();
        Deque<Integer> elements = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(!elements.isEmpty() && elements.peekFirst()<=i-k){
                elements.pollFirst();
            }
            while(!elements.isEmpty() && nums[elements.peekLast()]<=num){
                elements.pollLast();
            }
            elements.addLast(i);
            if(i>=k-1){
                result.add(nums[elements.peekFirst()]);
            }
        }
        System.out.println(result);
    }
}
