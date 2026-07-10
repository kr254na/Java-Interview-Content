package DSA.Array.KadaneAlgo;

/*
Given stock prices:
7 1 5 3 6 4
You can:
Buy once
Sell once
Buy before sell
Find the maximum profit.
Answer:
Buy = 1
Sell = 6
Profit = 5
 */
public class Stock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int minBuy=Integer.MAX_VALUE,maxProfit=0;
        for(int i=0;i<prices.length;i++){
            minBuy = Math.min(minBuy,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-minBuy);
        }
        System.out.println(maxProfit);
    }
}
