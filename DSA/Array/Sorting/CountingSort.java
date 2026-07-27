package DSA.Array.Sorting;

import java.util.Arrays;

/*
n = number of elements
k = range of values (max - min + 1)
Time:  O(n + k)
Space: O(k)

Counting Sort is excellent when the range of numbers is small.
 */

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = {7,2,5,1,8,5,2,0,8,1,8,7};
        int min=arr[0],max=arr[0];
        for(int i=0;i<arr.length;i++) {
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        int count[] = new int[max-min+1];
        for(int num:arr) {
            count[num-min]++;
        }
        int index = 0;
        for(int i=0;i<count.length;i++) {
            while(count[i]>0) {
                arr[index++] = i+min;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
