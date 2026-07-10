package DSA.Array.KadaneAlgo;

public class MaximumAbsoluteSubarray {

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int currMax = arr[0];
        int maxSum = arr[0];

        int currMin = arr[0];
        int minSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(arr[i], currMin + arr[i]);
            minSum = Math.min(minSum, currMin);
        }

        int ans = Math.max(Math.abs(maxSum), Math.abs(minSum));

        System.out.println(ans);
    }
}