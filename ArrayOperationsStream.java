package com.all.in.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayOperationsStream {
	public static void main(String[] args) {
		int[] arrInt = new int[] { 1,2,3,4,5,6 };
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);

		list.stream().distinct().forEach(System.out::println);

		int min = Arrays.stream(arrInt).min().getAsInt();
		System.out.println(min);

		int max = Arrays.stream(arrInt).max().getAsInt();
		System.out.println(max);

		double avarage = Arrays.stream(arrInt).average().getAsDouble();
		System.out.println(avarage);

		int sum = Arrays.stream(arrInt).sum();
		System.out.println(sum);

		Arrays.stream(arrInt).distinct().forEach(System.out::println);
		
		Integer minn=Stream.of(1,2,3,4,5,6).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minn);
		
		
		//2nd high
		
		
		//3rd high
		
		//2nd low
		
		//
		
		
		

	}
}