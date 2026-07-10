package DSA.Array.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Given an array nums and an integer target, return all unique quadruplets:
    nums[i] + nums[j] + nums[k] + nums[l] == target
 */
public class FourSum {
    public static void main(String[] args) {
        int[] arr = {-4,7,0,2,-5,3,1,-2};
        Arrays.sort(arr);
        //-5 -4 -2 0 1 2 3 7
        List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
        int target = 2;
        for(int i=0;i<arr.length-3;i++){
            if(i > 0 && arr[i] == arr[i-1])
                continue;
            for(int j=i+1;j<arr.length-2;j++){
                if(j > i + 1 && arr[j] == arr[j-1])
                    continue;
                int low=j+1,high=arr.length-1;
                while (low<high){
                    int sum = arr[i]+arr[j]+arr[low]+arr[high];
                    if(sum==target){
                        quadruplets.add(List.of(arr[i],arr[j],arr[low],arr[high]));
                        low++;
                        high--;
                        while(low<high && arr[low]==arr[low-1]){
                            low++;
                        }
                        while(low<high && arr[high]==arr[high+1]){
                            high--;
                        }
                    }
                    else if(sum<target){
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
        }
        System.out.println(quadruplets);
    }
}
