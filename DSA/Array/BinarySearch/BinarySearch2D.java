package DSA.Array.BinarySearch;

public class BinarySearch2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int left=0, mid, right=r*c-1;
        while(left<=right){
            mid = left + (right - left)/2;
            if(matrix[mid/c][mid%c]==target)
                return true;
            else if(matrix[mid/c][mid%c]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return false;
    }
}