package DSA.Array.KadaneAlgo;

/*
Kadane's Algo + Sliding Window
 */
public class MaxSubarraySumAtLeastK {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int k = 5;
        int maxEnding[] = new int[arr.length];
        int currSum=arr[0];
        maxEnding[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            currSum = Math.max(arr[i],currSum+arr[i]);
            maxEnding[i] = currSum;
        }
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        int low=0,high=k,res=windowSum;
        while(high<arr.length){
            windowSum+=arr[high];
            windowSum-=arr[low];
            low++;
            res = Math.max(res, windowSum);
            res = Math.max(res, windowSum + maxEnding[low - 1]);
            high++;
        }
        System.out.println(res);
    }
}
