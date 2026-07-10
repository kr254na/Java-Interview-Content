package DSA.Array.SlidingWindow;

import java.util.LinkedList;
import java.util.Queue;

/*
Given:
arr = {12, -1, -7, 8, -15, 30, 16, 28}
k = 3
For every window of size k, print the first negative number.
Windows
[12, -1, -7]     -> -1
[-1, -7, 8]      -> -1
[-7, 8, -15]     -> -7
[8, -15, 30]     -> -15
[-15, 30, 16]    -> -15
[30, 16, 28]     -> 0

Output:
[-1, -1, -7, -15, -15, 0]
 */
public class NegativeNumberWindow {
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k=3;
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<k; i++){
            if(arr[i] < 0)
                q.offer(i);
        }

        System.out.println(q.isEmpty() ? 0 : arr[q.peek()]);

        for(int i=k; i<arr.length; i++){

            while(!q.isEmpty() && q.peek() <= i-k)
                q.poll();

            if(arr[i] < 0)
                q.offer(i);

            System.out.println(q.isEmpty() ? 0 : arr[q.peek()]);
        }


    }
}
