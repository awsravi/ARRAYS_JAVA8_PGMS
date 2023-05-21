package com.all.in.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringArraysOperation {
	public static void main(String[] args) {

		List<String> arrStr = Arrays.asList("ravi", "kalak", "ahandrakala", "", "kumara", "kulasekhar");

		List<String> start = arrStr.stream().filter(s -> s.startsWith("k")).collect(Collectors.toList());
		System.out.println(start);
		// empty
		long empty = arrStr.stream().filter(s -> s.isEmpty()).count();
		System.out.println(empty);

		// remove emptys

		List<String> empty1 = arrStr.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println(empty1);

		// start&end with k
		List<String> startend = arrStr.stream().filter(s -> s.startsWith("k") && s.endsWith("k"))
				.collect(Collectors.toList());
		System.out.println(startend);

		// start&end with same
		arrStr.stream().filter(s -> s.length() > 0 && s.endsWith(String.valueOf(s.charAt(0))))
				.forEach(System.out::println);
		// add MR of each String
		List<String> mr = empty1.stream().map(s -> "MR: " + s).collect(Collectors.toList());
		System.out.println(mr);

		// revere all string

		List<String> revese = empty1.stream().sorted().collect(Collectors.toList());
		System.out.println(revese);
		
		
		//count graterThan 5
		List<String> countgt=arrStr.stream().filter(s ->s.length()>5).collect(Collectors.toList());
		System.out.println(countgt);

		//length find out
		
		arrStr.stream().map(String::length).forEach(System.out::println);
		
		//allmatch
		arrStr.stream().allMatch(s ->s.equals("ravi"));
		
	}

}
