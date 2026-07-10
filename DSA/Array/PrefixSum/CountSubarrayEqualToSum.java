package DSA.Array.PrefixSum;

import java.util.HashMap;

class CountSubarrayEqualToSum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        int count = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            int num = nums[i]-k;
            if(map.containsKey(num)){
                count+=map.get(num);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}
