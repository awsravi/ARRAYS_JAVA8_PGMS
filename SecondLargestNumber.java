package com.ajay.infosys;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] number = { 50, 30, 1, 5, 40, 100 };

		Arrays.sort(number);
		int length = number.length;

		if (length >= 2) {
			int second = number[length - 2];

			System.out.println("second largest number: " + second);

		} else {
			System.out.println("there is no elemnt");
		}
	}
}
