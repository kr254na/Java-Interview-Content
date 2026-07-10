package DSA.Array.BinarySearch;

/*
Double Binary Search
 */

class FirstAndLastPosition {
    public int[] searchRange(int[] arr, int target) {
        int low=0,mid,high=arr.length-1,start=-1,end=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                start=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if (start == -1)
            return new int[]{-1, -1};
        low=0;
        high=arr.length-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                end=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[] {start,end};
    }
}