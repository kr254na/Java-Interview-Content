package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
1475. Final Prices With a Special Discount in a Shop
Example 1:

Input: prices = [8,4,6,2,3]
Output: [4,2,4,2,3]
Explanation:
For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4, therefore, the final price you will pay is 8 - 4 = 4.
For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 4 - 2 = 2.
For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 6 - 2 = 4.
For items 3 and 4 you will not receive any discount at all.
 */

// Monotonic Stack
public class ShopDiscount {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<prices.length;i++) {
            while(!stack.isEmpty() && prices[stack.peek()]>=prices[i]) {
                int prev = stack.pop();
                prices[prev] = prices[prev]-prices[i];
            }
            stack.push(i);
        }
        return prices;
    }
}