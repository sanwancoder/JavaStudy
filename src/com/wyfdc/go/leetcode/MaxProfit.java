package com.wyfdc.go.leetcode;

/**
 * @Author:
 * desc: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 *
 */
public class MaxProfit {

  public static int maxProfit(int[] prices) {
    int profit = 0;
    for(int i=1;i<prices.length;i++){
      if(prices[i]>prices[i-1]){
        profit = profit + prices[i]-prices[i-1];
      }
    }
    return profit;
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,2,4};
    int[] arr2 = {7,1,5,3,6,4};
    System.out.println("profit = "+maxProfit(arr));
    System.out.println("profit = "+maxProfit(arr2));
  }

}
