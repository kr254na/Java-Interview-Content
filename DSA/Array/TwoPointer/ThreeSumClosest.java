package DSA.Array.TwoPointer;

import java.util.Arrays;

/*
    Given an integer array nums and an integer target, find three integers such that:
    nums[i] + nums[j] + nums[k]
    is closest to target.
    Return the sum of those three integers.
 */
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = {-4,7,0,2,-5,3,1,-2};
        Arrays.sort(arr);
        int res=arr[0]+arr[1]+arr[2];
        //-5 -4 -2 0 1 2 3 7
        int target = 13;
        for(int i=0;i<arr.length-2;i++){
            int low=i+1,high=arr.length-1;
            while (low<high){
                int sum = arr[low]+arr[high]+arr[i];
                if(sum==target){
                    System.out.println(sum);
                    return;
                }
                else if(Math.abs(target-sum)<Math.abs(target-res)){
                    res = sum;
                }
                if(sum<target){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        System.out.println(res);
    }
}
