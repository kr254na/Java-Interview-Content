package DSA.Array.BinarySearch;

/*
Time Complexity
Case	Complexity
Best	O(1)
Average	O(log n)
Worst	O(log n)
Space Complexity:
O(1)
 */
public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {1,4,6,8,20,36};
        int element = 20,found=-1;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==20) {
                found = mid;
                break;
            }
            else if(arr[mid]<20)
                low=mid+1;
            else
                high=mid-1;
        }
        System.out.println(found==-1?"Not Found":"Found at "+found);
    }
}
