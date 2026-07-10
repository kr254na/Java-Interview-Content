package DSA.Array.KadaneAlgo;

/*
In a circular array, the last element is connected to the first element.
Example:
Array: [5, -3, 5]
Normal Array:
5 → -3 → 5
Circular Array:
5 → -3 → 5
↑           ↓
└───────────┘
The maximum subarray can wrap around the end of the array.
 */
public class MaxCircularSubarray {
    public static void main(String[] args) {
        int arr[] = {5, -3, 5};
        int currSum=0,maxSum=Integer.MIN_VALUE,minSum=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(maxSum,currSum);
        }
        currSum = 0;
        for(int i=0;i< arr.length;i++){
            currSum=Math.min(arr[i],currSum+arr[i]);
            minSum=Math.min(minSum,currSum);
        }
        int totalSum=0;
        for(int i=0;i<arr.length;i++) {
            totalSum += arr[i];
        }
        int circularSum = totalSum - minSum;
        if(maxSum<0){
            System.out.println(maxSum);
        }
        else {
            System.out.println(Math.max(maxSum,circularSum));
        }
    }
}
