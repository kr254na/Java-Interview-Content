package DSA.Array.Sorting;

/*
Quick Sort is a fast divide-and-conquer sorting algorithm that sorts an array by selecting a pivot element and partitioning the array into two parts:
Elements smaller than the pivot go to the left.
Elements larger than the pivot go to the right.
The same process is recursively applied to both parts.

Time Complexity
Best Case: O(nlogn)
Average Case: O(nlogn)
Worst Case: O(n2) (when the pivot is consistently the smallest or largest element)

Space Complexity
Average: O(logn) (recursive call stack)
Worst: O(n)
In Place and unstable
Lomuto Partition - Pivot is last element
Hoarse Partition - Pivot is first element
 */

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr, int low, int high) {
        if(low<high) {
            int pivot  = partition(arr,low,high);
            sort(arr,low,pivot-1);
            sort(arr,pivot+1,high);
        }
    }
    private static int partition (int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j) {
            while(i<high && arr[i]<=pivot) {
                i++;
            }
            while(arr[j]>pivot) {
                j--;
            }
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void main(String[] args) {
        int arr[] = {10,7,8,9,1,5};
        sort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
