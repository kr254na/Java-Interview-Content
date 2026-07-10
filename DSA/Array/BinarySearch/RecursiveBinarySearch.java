package DSA.Array.BinarySearch;

public class RecursiveBinarySearch {

    static int search(int[] arr, int element){
        return search(arr,0,arr.length-1, element);
    }

    static int search(int[] arr, int low, int high, int element) {

        if(low>high)
            return -1;

        int mid = low+(high-low)/2;

        if(arr[mid]==element){
            return mid;
        }
        else if(arr[mid]>element){
            return search(arr,low,mid-1,element);
        }
        else{
            return search(arr,mid+1,high,element);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,6,8,20,36};
        int element = 20,found=-1;
        int low=0,high=arr.length-1;
        found = RecursiveBinarySearch.search(arr, element);
        System.out.println(found);
    }
}
