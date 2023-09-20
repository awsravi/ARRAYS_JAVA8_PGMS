package com.tao;

import java.util.Stack;

public class ArrayStackMaxPrice {

	public static void main(String[] args) {
		int[] stockPrices = { 100, 80, 120, 130, 70, 60, 100, 125 };
		int maxPrice = findMaxStockPrice(stockPrices);

		System.out.println("Maximum Stock Price: " + maxPrice);
	}

	public static int findMaxStockPrice(int[] stockPrices) {
		Stack<Integer> stack = new Stack<>();
		int maxPrice = Integer.MIN_VALUE;

		for (int price : stockPrices) {
			// While the stack is not empty and the current price is greater than the price
			// at the top of the stack,
			// pop elements from the stack and update maxPrice.
			while (!stack.isEmpty() && price > stack.peek()) {
				maxPrice = Math.max(maxPrice, stack.pop());
			}

			// Push the current price onto the stack.
			stack.push(price);
		}

		// The remaining elements in the stack are the decreasing prices at the end of
		// the array.
		// We can update maxPrice if needed by popping these elements.
		while (!stack.isEmpty()) {
			maxPrice = Math.max(maxPrice, stack.pop());
		}

		return maxPrice;
	}
}
