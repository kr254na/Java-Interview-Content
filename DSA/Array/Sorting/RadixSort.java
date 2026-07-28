package DSA.Array.Sorting;

/*
Radix Sort is a non-comparative sorting algorithm that sorts numbers by processing their digits one position at a time.
It usually sorts from the least significant digit (LSD) to the most significant digit (MSD), using a stable sorting
algorithm such as Counting Sort at each step.

Algorithm
Find the maximum number to determine the number of digits.
Starting from the least significant digit, sort the array using a stable sort based on the current digit.
Repeat for each digit until all digit positions have been processed.
Time Complexity
Best Case: O(d×(n+k))
Average Case: O(d×(n+k))
Worst Case: O(d×(n+k))

Where:

n = number of elements
d = number of digits in the largest number
k = range of digit values (10 for decimal numbers)

If k is constant (10), the complexity is approximately O(d × n).

Space Complexity
O(n + k)

Needs to modify by separating positive and negative elements for negative numbers array
 */

import java.util.Arrays;

public class RadixSort {

    private static void countingSort(int arr[], int exp) {
        int count[] = new int[10];
        int output[] = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++) {
            count[i]+=count[i-1];
        }
        for(int i=arr.length-1;i>=0;i--) {
            int digit = (arr[i]/exp)%10;
            output[count[digit]-1]=arr[i];
            count[digit]--;
        }
        System.arraycopy(output,0,arr,0,arr.length);
    }

    public static void main(String[] args) {
        int arr[] = {53,13,774,86,6,94,3,133,5};
        int max = Arrays.stream(arr).max().getAsInt();
        for(int exp=1; max/exp>0; exp=exp*10) {
            countingSort(arr,exp);
        }
        System.out.println(Arrays.toString(arr));
    }
}
