package com.kaygen;

import java.util.Arrays;

public class MoveAllPositiveNumbersArray {
	public static void main(String[] args) {

		int[] num = { -2, -3, -5, -8, 2, 5, 4, 9 };
		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(num));

	}
}
