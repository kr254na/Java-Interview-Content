package DSA.Array.TwoPointer;

class MoveZeros {
    public void moveZeroes(int[] nums) {
        int low=0,temp;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=low){
                    temp=nums[i];
                    nums[i]=nums[low];
                    nums[low]=temp;
                }
                low++;
            }
        }
    }
}
