package DSA.Array.HashMap;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            ans.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(ans.values());
    }
}