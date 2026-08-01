package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {
    public String decodeString(String s) {
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<StringBuilder> stack2 = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n=0;
        for(char ch:s.toCharArray()) {
            if(Character.isDigit(ch)) {
                n=n*10+Character.getNumericValue(ch);
            }
            else if(ch=='['){
                stack1.push(n);
                n=0;
                stack2.push(sb);
                sb = new StringBuilder();
            }
            else if(ch==']'){
                int num = stack1.pop();
                StringBuilder temp = sb;
                sb = stack2.pop();
                while(num-- > 0){
                    sb.append(temp);
                }
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}