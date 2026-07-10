package DSA.Array.SlidingWindow;

/*
Given:
arr = {2, 1, 5, 2, 3, 2}
k = 7

Find the length of the smallest subarray whose sum ≥ k.
 */
// For positive numbers only
public class MinimumLengthSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int k=7,low=0,high=0,sum=0,min=Integer.MAX_VALUE;
        while(high<arr.length){
            sum+=arr[high];
            while(sum>=k){
                min = Math.min(min,high-low+1);
                sum -= arr[low];
                low++;
            }
            high++;
        }
        System.out.println(min);
    }
}
