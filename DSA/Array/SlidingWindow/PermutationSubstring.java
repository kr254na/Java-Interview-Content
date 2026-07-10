package DSA.Array.SlidingWindow;

import java.util.HashMap;

/*
String s
String p
👉 Return true if any permutation of p exists in s as a substring
 */
public class PermutationSubstring {
    public static void main(String[] args) {
        String s = "aaab";
        String p = "aab";
        HashMap<Character,Integer> frequencyMap = new HashMap<>();
        for(int i=0;i<p.length();i++){
            frequencyMap.put(p.charAt(i),frequencyMap.getOrDefault(p.charAt(i),0)+1);
        }
        int low=0,high=0,count=frequencyMap.size(),perm=0;
        while(high<s.length()){
            char leftChar = s.charAt(low);
            char rightChar = s.charAt(high);
            if(frequencyMap.containsKey(rightChar)) {
                frequencyMap.put(rightChar, frequencyMap.get(rightChar)-1);
                if(frequencyMap.get(rightChar)==0)
                    count--;
            }
            if((high-low+1)>p.length()){
                if (frequencyMap.containsKey(leftChar)) {
                    if (frequencyMap.get(leftChar) == 0) {
                        count++;
                    }
                    frequencyMap.put(leftChar, frequencyMap.get(leftChar) + 1);
                }
                low++;
            }
            if(high-low+1==p.length() && count==0){
                perm++;
            }
            high++;
        }
        System.out.println(perm);
    }
}
