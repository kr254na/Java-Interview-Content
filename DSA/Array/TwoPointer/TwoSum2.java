package DSA.Array.TwoPointer;

//Indices whose sum equals target in sorted array
public class TwoSum2 {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,8,11};
        int target = 11;
        int left=0,right= arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println(left);
                System.out.println(right);
                break;
            }
            else if(arr[left]+arr[right]>target){
                right--;
            }
            else{
                left++;
            }
        }
    }
}
