package DSA.Array.BinarySearch;

class InsertPosition {
    public int searchInsert(int[] arr, int element) {
        int low=0,mid,high=arr.length-1;
        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid]==element) {
                return mid;
            }
            else if(arr[mid]<element){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}
