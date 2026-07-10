package DSA.Array.TwoPointer;

/*
    Given a sorted array (can contain negative numbers),
    return a new array containing the squares of each number, also sorted.
 */

public class SortedSquares {
    public static void main(String[] args) {
        int arr1[] = {-12,-9,-4,-3,-1,0,1,1,3,5,7,8,11};
        int arr2[] = new int[arr1.length];
        int left=0, right=arr1.length-1;
        int k=arr2.length-1;
        while(left<=right){
            if(Math.abs(arr1[left])<Math.abs(arr1[right])){
                arr2[k--]=(int) Math.pow(arr1[right--],2);
            }
            else {
                arr2[k--]=(int) Math.pow(arr1[left++],2);
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
