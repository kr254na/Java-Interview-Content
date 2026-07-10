package DSA.Array.TwoPointer;

// Remove duplicates in the same array and return number of unique elements
// Two Pointer Approach
public class RemoveDuplicates {
    public static int remove(int arr[]){
        if(arr.length==0)
            return 0;
        int slow=0;
        for(int i=1;i<arr.length;i++){
            if(arr[slow]!=arr[i]){
                slow++;
                arr[slow]=arr[i];
            }
        }
        return slow+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,6,8,8,9,14,14};
        int k = RemoveDuplicates.remove(arr);
        System.out.println("Unique Elements : "+k);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
