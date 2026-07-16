package DSA.Array.Sorting;

/*
Time Complexity
Case	Time
Best	O(n²)
Average	O(n²)
Worst	O(n²)
In-place sorting algorithm
Unstable
 */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,2,9,1,7,2,6};
        for(int i=0;i<arr.length-1;i++) {
            int min = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[min]>arr[j]) {
                    min=j;
                }
            }
            if(min!=i){
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
