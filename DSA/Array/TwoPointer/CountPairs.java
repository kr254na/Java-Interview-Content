package DSA.Array.TwoPointer;

import java.util.Arrays;

// Count pairs less than target
public class CountPairs {
    public static void main(String[] args) {
        int arr[] = {2,3,2,5,1,6,8,3,5};
        Arrays.sort(arr);
        // 1,2,2,3,3,5,5,6,8
        int target = 9, low=0, high=arr.length-1, pairs=0;
        while(low<high){
            if((arr[low]+arr[high])>=target) {
                high--;
            }
            else{
                pairs+=high-low;
                low++;
            }
        }
        System.out.println(pairs);
    }
}
