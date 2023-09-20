package com.tao;

public class MaxStockProfit {
	public static void main(String[] args) {
		int[] stockPrices = { 7,3,5,8,1,6 };
		int maxProfit = findMaxStockProfit(stockPrices);

		System.out.println("Max Profit: " + maxProfit);
	}

	public static int findMaxStockProfit(int[] stockPrices) {
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price : stockPrices) {
			if (price < buyPrice) {
				buyPrice = price;
			} else if (price - buyPrice > maxProfit) {
				maxProfit = price - buyPrice;
			}
		}

		return maxProfit;
	}
}
