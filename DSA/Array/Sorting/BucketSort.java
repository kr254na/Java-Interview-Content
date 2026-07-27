package DSA.Array.Sorting;

/*
Bucket Sort is a sorting algorithm that distributes elements into several buckets, sorts each bucket individually, and then combines the buckets to produce the final sorted array. It works best when the input is uniformly distributed over a known range.

Algorithm
Create n empty buckets.
Distribute each element into its appropriate bucket.
Sort each bucket (using a sorting algorithm like insertion sort).
Concatenate all the sorted buckets.

Time Complexity
Best Case: O(n + k) (where k is the number of buckets)
Average Case: O(n + k)
Worst Case: O(n²) (if all elements fall into one bucket)
Space Complexity
O(n)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        float arr[] = {0.4f,0.2f,0.1f,0.3f,0.9f,0.2f};
        List<Float>[] buckets = new ArrayList[arr.length];

        for(int i=0;i<arr.length;i++) {
            buckets[i] = new ArrayList<>();
        }

        for (float v : arr) {
            int index = (int) (v * arr.length);
            //int index = (int) ((long) (value - min) * bucketCount
            //                    / (max - min + 1L));
            buckets[index].add(v);
        }

        int idx=0;
        for (List<Float> bucket : buckets) {
            Collections.sort(bucket); // Can use optimal sorting
            for(float value:bucket){
                arr[idx++]=value;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
