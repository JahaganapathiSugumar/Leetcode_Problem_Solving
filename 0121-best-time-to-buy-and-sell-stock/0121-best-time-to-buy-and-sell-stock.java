class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxP = 0;

        while(sell < prices.length){
            if(prices[buy] > prices[sell]){
                buy = sell;
            }
            else{
                int res = prices[sell] - prices[buy];
                maxP = Math.max(maxP,res);
            }
            sell++;
        }
        return maxP;
    }
}