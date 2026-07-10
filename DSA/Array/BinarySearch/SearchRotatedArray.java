package DSA.Array.BinarySearch;

class SearchRotatedArray {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1,mid;
        while(low<high){
            mid=low+(high-low)/2;
            if(nums[mid]>nums[nums.length-1]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        if(target>=nums[low] && target<=nums[nums.length-1]){
            high=nums.length-1;
        }
        else{
            low=0;
            high--;
        }
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}