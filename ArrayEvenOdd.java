package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayEvenOdd {
	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> arrList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> listeven = arrList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(listeven);
		
		List<Integer> listodd=arrList.stream().filter(n-> n%2!=0).collect(Collectors.toList());
		System.out.println(listodd);
		System.out.println("===============================");
		//Arrays.stream(arr).filter(num -> num % 2 == 0).forEach(System.out::println);
		//Arrays.stream(arr).filter(num -> num % 2 != 0).forEach(System.out::println);
		
		//print odd numbers with desc order
			
				arrList.stream().filter(n ->n%2!=0).sorted((a,b) -> b-a).forEach(System.out::println);
				
				arrList.stream().filter(n ->n%2!=0).sorted((a1,a2) ->a1-a2 ).forEach(System.out::println);
				
				
		
		
	}
}
