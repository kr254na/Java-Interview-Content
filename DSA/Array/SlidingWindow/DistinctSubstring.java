package DSA.Array.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/*
Given a string s and an integer k, find:
The length of the longest substring that contains at most K distinct characters
 */
public class DistinctSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Map<Character,Integer> frequencyMap = new HashMap<>();
        int low=0,high=0,max=Integer.MIN_VALUE;
        char ch;
        int k=2;
        while(high<s.length()) {
            ch = s.charAt(high);
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
            while(frequencyMap.size()>k){
                frequencyMap.put(s.charAt(low),frequencyMap.get(s.charAt(low))-1);
                if(frequencyMap.get(s.charAt(low)) == 0)
                    frequencyMap.remove(s.charAt(low));
                low++;
            }
            max = Math.max(max,high-low+1);
            high++;
        }
        System.out.println(max);
    }
}

