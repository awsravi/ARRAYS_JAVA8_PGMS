package com.oct.it;

import java.util.HashSet;

public class CommonElements {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 4, 5, 6 };
		int[] arr2 = { 2, 3, 5, 7 };

		HashSet<Integer> hs = new HashSet<>();
		for (int num : arr1) {
			hs.add(num);

		}
		System.out.println("Common Elements : ");
		for (int num : arr2) {
			if (hs.contains(num)) {
				System.out.print(num + " ");
			}
		}

	}
}
