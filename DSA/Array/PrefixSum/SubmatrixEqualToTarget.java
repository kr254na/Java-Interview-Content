package DSA.Array.PrefixSum;

import java.util.HashMap;
import java.util.Map;

class SubmatrixEqualToTarget {
    public int numSubmatrixSumTarget(int[][] mat, int target) {
        for(int i=0;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                mat[i][j]+=mat[i][j-1];
            }
        }
        int prefix,count=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<mat[0].length;i++){
            for(int j=i;j<mat[0].length;j++){
                prefix=0;
                map.clear();
                map.put(0,1);
                for(int k=0;k<mat.length;k++){
                    prefix+=mat[k][j]-(i>0?mat[k][i-1]:0);
                    if(map.containsKey(prefix-target)){
                        count+=map.get(prefix-target);
                    }
                    map.put(prefix,map.getOrDefault(prefix,0)+1);
                }
            }
        }
        return count;
    }
}
