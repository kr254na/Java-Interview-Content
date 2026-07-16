package DSA.Array.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Input: arr = [40,10,20,30]
Output: [4,1,2,3]
 */

public class RankTransform {
    public int[] arrayRankTransform(int[] arr) {
        int temp[] = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        int rank = 1;
        Map<Integer, Integer> map = new HashMap<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (map.putIfAbsent(num, rank) == null) {
                rank++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            temp[i] = map.get(temp[i]);
        }
        return temp;
    }
}
