package LeetcodeInterviewProblems;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
 */

public class BestTimeStock {
    public static void main(String[] args){
        int[] arr = {1,2,4};
        int res = maxProfit(arr);
        System.out.println(res);

    }

    static int maxProfit(int[] prices) {
        int left = 0; 
        int right = 1; 
        int maxProfit = 0;
 
        while(right < prices.length){
            if(prices[left] < prices[right])
            {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                left = right; 
            }
            right++;
        }
 
        return maxProfit;
     
    }
}
