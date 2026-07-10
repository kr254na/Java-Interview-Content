package DSA.Array.TwoPointer;

// Remove all occurences of the letter
public class RemoveOccurence {
    public static void main(String[] args) {
        int arr[] = {1,1,3,8,4,7,1,1,2,5,8,9,4,2,1};
        int num = 1;
        int slow=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=num){
                arr[slow++]=arr[i];
            }
        }
        for(int i=0;i<slow;i++){
            System.out.println(arr[i]);
        }
    }
}
