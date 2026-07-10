package DSA.Array.SlidingWindow;

/*
Given an array and an integer k, find the maximum sum of any contiguous subarray of size k.
arr = [2, 1, 5, 1, 3, 2]
k = 3
Subarrays:
[2,1,5] = 8
[1,5,1] = 7
[5,1,3] = 9
[1,3,2] = 6
Answer = 9
 */
public class MaximumSumSubarray {
    public static void main(String[] args) {
        int arr[] = {1,6,2,9,0,5,7,9,9,4,2,5,7};
        int k=3;

        //Brute Force
        int sum,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-k;i++){
            sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            if(sum>maxSum)
                maxSum=sum;
        }
        System.out.println(maxSum);

        //Optimized
        int window=0,maxWindow;
        for(int i=0;i<k;i++){
            window+=arr[i];
        }
        maxWindow=window;
        for(int i=k;i<arr.length;i++){
            window+=arr[i];
            window-=arr[i-k];
            if(window>maxWindow)
                maxWindow=window;
        }
        System.out.println(maxWindow);
    }
}
