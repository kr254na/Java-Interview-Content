package DSA.Array.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

/*
Longest Substring Without Repeating Characters
 */
public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Set<Character> characterSet = new HashSet<>(); // Can be optimized further using HashMap
        int low=0,high=0,max=Integer.MIN_VALUE;
        char ch;
        while(high<s.length()){
            ch = s.charAt(high);
            while(characterSet.contains(ch)){
                characterSet.remove(s.charAt(low));
                low++;
            }
            characterSet.add(ch);
            max = Math.max(max,high-low+1);
            high++;
        }
        System.out.println(max);
    }
}
