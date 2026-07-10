package DSA.Array.SlidingWindow;

/*
Given:
String txt = "forxxorfxdofr";
String pat = "for";
Count how many substrings of txt are anagrams of pat.

 */

import java.util.HashMap;
import java.util.Map;

class AnagramOccurence {

    public static void main(String[] args) {

        String text = "forxxorfxdofr";
        String pat = "for";

        System.out.println(countAnagrams(text, pat));
    }

    public static int countAnagrams(String text, String pat) {

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : pat.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size();

        int i = 0;
        int j = 0;
        int k = pat.length();

        int ans = 0;

        while(j < text.length()) {

            char rightChar = text.charAt(j);

            if(map.containsKey(rightChar)) {

                map.put(rightChar, map.get(rightChar) - 1);

                if(map.get(rightChar) == 0)
                    count--;
            }

            if(j - i + 1 == k) {

                // Anagram found
                if(count == 0) {
                    System.out.println(text.substring(i,j+1));
                    ans++;
                }
                // Remove left character
                char leftChar = text.charAt(i);

                if(map.containsKey(leftChar)) {

                    if(map.get(leftChar) == 0)
                        count++;

                    map.put(leftChar, map.get(leftChar) + 1);
                }

                i++;

            }
            j++;
        }

        return ans;
    }
}