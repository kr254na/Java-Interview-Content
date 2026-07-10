package DSA.Array.BinarySearch;

class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num < 2)
            return true;
        int low=0,high=num/2;
        long square;
        while(low<=high){
            int mid = low+(high-low)/2;
            square = (long) mid*mid;
            if(square==num) {
                return true;
            }
            else if(square<num)
                low=mid+1;
            else
                high=mid-1;
        }
        return false;
    }
}