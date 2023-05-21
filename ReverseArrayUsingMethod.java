package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayUsingMethod {
	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		List<Integer> listArr=Arrays.asList(1,2,3,4,5);
	List<Integer> list=	listArr.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
	}
}