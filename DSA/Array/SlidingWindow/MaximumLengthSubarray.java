package DSA.Array.SlidingWindow;

/*
Given:
arr = {4,2,1,7,8,1,2,8,10}
limit = 8

Find the maximum length subarray whose sum ≤ limit.
 */

// Works only for positive numbers
public class MaximumLengthSubarray {
    public static void main(String[] args) {
        int arr[] = {4,2,1,7,8,1,2,8,10};
        int limit=8;
        int low=0,high=0,sum=0,max=0;
        while(high<arr.length){
            sum+=arr[high];
            while(sum>limit){
                sum-=arr[low];
                low++;
            }
            max=Math.max(max,high-low+1);
            high++;
        }
        System.out.println(max);
    }
}
