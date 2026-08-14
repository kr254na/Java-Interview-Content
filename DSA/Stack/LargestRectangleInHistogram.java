package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int max = 0;
        for(int i=0;i<=heights.length;i++) {
            int currentHeight = (i == heights.length)
                    ? 0
                    : heights[i];
            while(!stack.isEmpty() && heights[stack.peek()]>currentHeight) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                max = Math.max(max,width*height);
            }
            stack.push(i);
        }
        return max;
    }
}