package DSA.Array.SlidingWindow;
/*
Given:
nums = [1,0,1,0,1]
k = 2
Find the number of subarrays whose sum is exactly k in a BINARY ARRAY.
 */
public class BinarySubarraySum {
    public static int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;
        int low = 0, sum = 0, count = 0;
        for (int high = 0; high < nums.length; high++) {
            sum += nums[high];
            while (sum > goal) {
                sum -= nums[low];
                low++;
            }
            count += high - low + 1;
        }
        return count;
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
}