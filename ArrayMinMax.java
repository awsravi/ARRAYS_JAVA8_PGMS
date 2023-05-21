package com.array;

import java.util.Arrays;

public class ArrayMinMax {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		Integer min = Arrays.stream(arr).min().getAsInt();
		System.out.println(min);
		
		Integer max=Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
	}
}
