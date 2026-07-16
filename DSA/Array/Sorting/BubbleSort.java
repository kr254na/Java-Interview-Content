package DSA.Array.Sorting;

import java.util.Arrays;

/*
Time Complexity
Case	Time
Best (already sorted)	O(n)
Average	O(n²)
Worst (reverse sorted)	O(n²)
Stable and inplace algorithm
 */

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,7,2,9,1,3};
        for (int i=0;i<arr.length-1;i++) {
            boolean swapped = false;
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swapped==false)
                break;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
