package DSA.Array.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Given an array, find all unique triplets such that:
    arr[i] + arr[j] + arr[k] == 0
    and
    i != j != k
    Time Complexity : O(n^2)
*/
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-4,7,0,2,-5,3,1,-2};
        Arrays.sort(arr);
        //-5 -4 -2 0 1 2 3 7
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        int low,high;
        for(int i=0;i<arr.length-2;i++){
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i]>0){
                break;
            }
            low=i+1;
            high=arr.length-1;
            while(low<high){
                if(arr[low]+arr[high]+arr[i]==0){
                    triplets.add(List.of(
                            arr[i],arr[low],arr[high]
                    ));
                    low++;
                    high--;
                    while(low < high && arr[low] == arr[low-1]){
                        low++;
                    }
                    while(low < high && arr[high] == arr[high+1]){
                        high--;
                    }
                }
                else if(arr[low]+arr[high]+arr[i]<0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        System.out.println(triplets);
    }
}
