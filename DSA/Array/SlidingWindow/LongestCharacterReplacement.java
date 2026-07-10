package DSA.Array.SlidingWindow;

/*
Longest Repeating Character Replacement (LeetCode 424)
Given:
s = "AABABBA"
k = 1
You can replace at most k characters.
Find the length of the longest substring that can be made of the same character after at most k replacements.
Output:
4
Because:
AABA → replace B with A → AAAA
Length = 4.
 */

import java.util.HashMap;
import java.util.Map;

public class LongestCharacterReplacement{
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int maxFreq=0,maxLength=0;
        Map<Character,Integer> frequencyMap = new HashMap<>();
        int low=0,high=0;
        while(high<s.length()){
            char ch = s.charAt(high);
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq, frequencyMap.get(ch));
            while(high-low+1-maxFreq>k){
                frequencyMap.put(s.charAt(low),frequencyMap.get(s.charAt(low))-1);
                low++;
            }
            maxLength = Math.max(maxLength,high-low+1);
            high++;
        }
        System.out.println(maxLength);
    }
}