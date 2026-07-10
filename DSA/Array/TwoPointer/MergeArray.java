package DSA.Array.TwoPointer;

// Merge two sorted arrays
public class MergeArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,5,8,9,9,56};
        int arr2[] = {3,7,8,8,9,12};
        int n = arr1.length+arr2.length;
        int arr3[] = new int[n];
        int p1=0,p2=0,p3=0;
        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1]<arr2[p2]){
                arr3[p3++]=arr1[p1++];
            }
            else{
                arr3[p3++]=arr2[p2++];
            }
        }
        while(p1<arr1.length){
            arr3[p3++]=arr1[p1++];
        }
        while(p2<arr2.length){
            arr3[p3++]=arr2[p2++];
        }
        for(int i=0;i<n;i++){
            System.out.println(arr3[i]);
        }
    }
}
