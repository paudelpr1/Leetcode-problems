class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = buy+1;
        int profit = 0;

        while(sell < prices.length){
            if(prices[buy] >= prices[sell]){
                buy = sell;
            }
            else{
                int sub = prices[sell] - prices[buy];
                profit = Math.max(profit, sub);
            }
            sell++;;
        }

        return profit;   
    }
}