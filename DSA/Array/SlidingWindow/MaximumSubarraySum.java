package DSA.Array.SlidingWindow;

/*
Given:
arr = {4,1,1,1,2,3,5}
k = 5
Find the maximum length subarray whose sum equals k.
 */
public class MaximumSubarraySum {
    public static void main(String[] args) {
        int arr[] = {4,0,1,1,1,2,0,3,5};
        int k=5;
        int low=0,high=0,sum=0,max=0;
        while(high<arr.length){
            sum+=arr[high];
            while (sum>k){
                sum-=arr[low];
                low++;
            }
            if(sum==k) {
                max=Math.max(max,high-low+1);
            }
            high++;
        }
        System.out.println(max);
    }
}
