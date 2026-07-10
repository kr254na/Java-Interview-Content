package DSA.Array.KadaneAlgo;

/*
Maximum Sum Rectangle in a Matrix ⭐⭐⭐⭐⭐
Given a 2D matrix, find the rectangle with the maximum sum.
Example:
 1   2  -1
-3   4   2
 1  -2   5
Use Kadane on compressed rows.
Complexity:
Brute Force : O(n^6)
Kadane's : O(rows² × cols) => O(n^3)
 */
public class MaximumRectangleSum {
    public static int kadane(int[] arr) {
        int currSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,-1},
                {-3,4,2},
                {1,-2,5}
        };
        int maxSum=Integer.MIN_VALUE;
        for(int top=0;top< matrix.length;top++){
            int temp[] = new int[matrix[top].length];
            for(int bottom=top;bottom< matrix.length;bottom++){
                int sum=0;
                for(int c=0;c<matrix[top].length;c++){
                    temp[c]+=matrix[bottom][c];
                }
                maxSum=Math.max(maxSum,kadane(temp));
            }
        }
        System.out.println(maxSum);
    }
}
