package com.oct.it;

import java.util.Arrays;

public class CommonElementsJava8 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 4, 5, 6 };
		int[] arr2 = { 2, 3, 5, 7 };

		// Find common elements
		int[] commonElements = findCommonElements(arr1, arr2);

		// Print the common elements
		System.out.println("Common Elements: " + Arrays.toString(commonElements));
	}

	public static int[] findCommonElements(int[] arr1, int[] arr2) {
		return Arrays.stream(arr1)
				.filter(x -> Arrays.stream(arr2)
				.anyMatch(y -> y == x))
				.distinct().toArray();

	}
}