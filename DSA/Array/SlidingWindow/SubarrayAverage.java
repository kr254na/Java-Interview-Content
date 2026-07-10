package DSA.Array.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

/*
Given:
arr = {1, 3, 2, 6, -1, 4, 1, 8, 2}
k = 5
Find the average of every subarray of size k.
 */
public class SubarrayAverage {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        int low=0,high=0,sum=0;
        List<Double> list = new ArrayList<>();
        while(high<arr.length){
            sum+=arr[high];
            if(high-low+1==k) {
                list.add((double)sum/k);
                sum-=arr[low];
                low++;
            }
            high++;
        }
        System.out.println(list);
    }
}
