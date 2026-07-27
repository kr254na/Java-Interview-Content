package DSA.Array.Sorting;

/*
Complexity
Case	Time
Best	O(n log n)
Average	O(n log n)
Worst	O(n log n)

Space: O(log n) with the recursive implementation due to the recursion stack.

With an iterative heapify, auxiliary space can be O(1).
 */

public class HeapSort {
    public void heapify(int arr[],int n, int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < n && arr[left]>arr[largest]) {
            largest = left;
        }
        if(right < n && arr[right]>arr[largest]) {
            largest = right;
        }
        if(largest!=i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr,n,largest);
        }
    }
    public void heapSort(int arr[]) {
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--) {
            heapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
    }
}
