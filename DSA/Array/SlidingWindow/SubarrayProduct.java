package DSA.Array.SlidingWindow;

/*
Given:
nums = [10, 5, 2, 6]
k = 100
Find number of subarrays whose product < k.
 */
public class SubarrayProduct {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int low=0,prod=1,high=0,count=0;
        while (high<nums.length){
            prod *= nums[high];
            while (prod>=k){
                prod/=nums[low];
               low++;
            }
            count+=high-low+1;
            high++;
        }
        System.out.println(count);
    }
}
