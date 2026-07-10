package DSA.Array.SlidingWindow;

/*
Given binary array:
nums = [1,1,0,0,1,1,1,0,1]
k = 2
Find the maximum length subarray that contains at most K zeros.
 */
public class KZeroesSubarray {
    public static void main(String[] args) {
        int[] nums = {1,1,0,0,1,1,1,0,1};
        int k = 2;
        int low=0, high=0, zeroes=0,maxLen=0;
        while (high<nums.length){
            if(nums[high]==0)
                zeroes++;
            while (zeroes>k){
                if(nums[low]==0)
                    zeroes--;
                low++;
            }
            maxLen = Math.max(maxLen,high-low+1);
            high++;
        }
        System.out.println(maxLen);
    }
}
