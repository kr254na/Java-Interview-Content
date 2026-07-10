package DSA.Array.PrefixSum;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int arr[]={4,6,8,3,1,0,6,8};
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
