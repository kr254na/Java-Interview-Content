package DSA.Array.TwoPointer;

/*
Given an integer array nums, you need to find one continuous subarray such that if you only sort this subarray in non-decreasing order,
then the whole array will be sorted in non-decreasing order.
Return the shortest such subarray and output its length.

Example 1:

Input: nums = [2,6,4,8,10,9,15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 */
class UnsortedSubarray {
    public int findUnsortedSubarray(int[] arr) {
        int leftBoundary = Integer.MIN_VALUE;
        int rightBoundary = Integer.MAX_VALUE;
        int left=-1,right=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=leftBoundary)
                leftBoundary=arr[i];
            else{
                right=i;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<=rightBoundary)
                rightBoundary=arr[i];
            else{
                left=i;
            }
        }
        return right==-1?0:right-left+1;
    }
}