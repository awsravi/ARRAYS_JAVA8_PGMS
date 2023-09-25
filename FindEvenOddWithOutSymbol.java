package com.sep.it;

public class FindEvenOddWithOutSymbol {
	public static void main(String[] args) {

		int number = 5;

		if ((number & 1) == 0) {
			System.out.println(number + " is even.");
		} else {
			System.out.println(number + " is odd.");
		}

	}
}
