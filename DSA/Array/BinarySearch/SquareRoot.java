package DSA.Array.BinarySearch;

class SquareRoot {
    public int mySqrt(int x) {
        int low=0,mid,high=x;
        long square;
        while(low<=high){
            mid = low+(high-low)/2;
            square = (long) mid*mid;
            if(square==x) {
                return mid;
            }
            else if(square<x)
                low=mid+1;
            else
                high=mid-1;
        }
        return high;
    }
}