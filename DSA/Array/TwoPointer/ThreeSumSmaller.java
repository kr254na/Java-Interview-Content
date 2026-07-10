package DSA.Array.TwoPointer;

import java.util.Arrays;
/*
    Count number of triplets such that:
    sum < target
*/
    public class ThreeSumSmaller {
        public static void main(String[] args) {
            int[] arr = {-4,7,0,2,-5,3,1,-2};
            Arrays.sort(arr);
            //-5 -4 -2 0 1 2 3 7
            int target = 13,count=0;
            for(int i=0;i<arr.length-2;i++){
                int low=i+1,high=arr.length-1;
                while (low<high){
                    int sum = arr[low]+arr[high]+arr[i];
                    if(sum<target) {
                        count+=high-low;
                        low++;
                    }
                    else {
                        high--;
                    }
                }
            }
            System.out.println(count);
        }
    }
