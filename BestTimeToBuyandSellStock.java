/*Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/
class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=0;
        int minsofar=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            minsofar=Math.min(minsofar,prices[i]);
            int pro=prices[i]-minsofar;
            maxpro=Math.max(maxpro,pro);
        }
        return maxpro;
        }
}