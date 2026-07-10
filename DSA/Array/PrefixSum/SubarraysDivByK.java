package DSA.Array.PrefixSum;

import java.util.HashMap;
import java.util.Map;

class SubarraysDivByK {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(i!=0)
                nums[i]+=nums[i-1];
            int num = ((nums[i]%k)+k)%k;
            if(map.containsKey(num)){
                count+=map.get(num);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;
    }
}