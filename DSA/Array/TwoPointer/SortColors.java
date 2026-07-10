package DSA.Array.TwoPointer;
/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects
of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */
class SortColors {
    public void sortColors(int[] arr) {
        int low=0,mid=0,high=arr.length-1,temp;
        while(mid<=high){
            if(arr[mid]==0){
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==2){
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
            else{
                mid++;
            }
        }
    }
}
