package Practice;
import java.util.*;
class Frequency
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word:");
        String s = sc.next();
        int freq;
        outer:
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq=1;
            for(int j=0;j<i;j++){
              char c = s.charAt(j);
              if(c==ch){
                  continue outer;
              }
            }
            for(int j=i+1;j<s.length();j++){
                char c = s.charAt(j);
                if(ch==c){
                    freq++;
                }
            }
            System.out.println("Frequency of "+ch+" = "+freq);
        }
    }
}