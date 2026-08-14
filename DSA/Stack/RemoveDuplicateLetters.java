package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] frequencyArray = new int[26];
        boolean[] used = new boolean[26];
        for(int i=0;i<s.length();i++) {
            int index = s.charAt(i)-'a';
            frequencyArray[index]++;
        }
        for(int i=0;i<s.length();i++) {
            char current = s.charAt(i);
            int index = current - 'a';
            frequencyArray[index]--;
            if(used[index]) {
                continue;
            }
            while(!stack.isEmpty() && s.charAt(stack.peek())>current) {
                int previousChar = s.charAt(stack.peek());
                int idx = previousChar - 'a';
                if(frequencyArray[idx]>0) {
                    stack.pop();
                    used[idx]=false;
                }
                else {
                    break;
                }
            }
            stack.push(i);
            used[index]=true;
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(s.charAt(stack.removeLast()));
        }
        return ans.toString();
    }
}
