package DSA.Array.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/*
Given:
String s = "ADOBECODEBANC";
String t = "ABC";
Find the smallest substring of s that contains all characters of t.
Output:
"BANC"
 */
public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        Map<Character,Integer> frequencyMap = new HashMap<>();
        for(char ch:t.toCharArray()){
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
        }
        int low=0,high=0,minLength=Integer.MAX_VALUE,count=frequencyMap.size();
        while(high<s.length()){
            char ch = s.charAt(high);
            if(frequencyMap.containsKey(ch)){
                frequencyMap.put(ch,frequencyMap.get(ch)-1);
                if(frequencyMap.get(ch)==0){
                    count--;
                }
            }
            while (count == 0){
                minLength = Math.min(minLength,high-low+1);
                if(frequencyMap.containsKey(s.charAt(low))) {
                frequencyMap.put(s.charAt(low),frequencyMap.get(s.charAt(low))+1);
                if(frequencyMap.get(s.charAt(low))==1){
                    count++;
                }
                }
                low++;
            }
            high++;
        }
        System.out.println(minLength);
    }
}
