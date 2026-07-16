package DSA.Array.Sorting;

/*
Time Complexity
Case	Time
Best	O(n)
Average	O(n²)
Worst	O(n²)
In place and stable sorting algorithm
 */

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6,2,9,1,7,2,6};
        for(int i=1;i<arr.length;i++) {
            int key = arr[i];
            int idx = i-1;
            while(idx>=0 && key<arr[idx]) {
                arr[idx+1] = arr[idx];
                idx--;
            }
            arr[idx+1] = key;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
