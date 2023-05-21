package com.java.array8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EvenOdd {
	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(11, 2, 3, 4, 5, 6, 7, 8, 9, 1, 7, 8, 9);
		//even
		mylist.stream().filter(n -> n%2==0).distinct().forEach(System.out::println);

		// start with 1
		mylist.stream().map(n -> n+"").filter(e -> e.startsWith("1")).forEach(System.out::println);
		//duplicate remove
		 mylist.stream().distinct().forEach(System.out::println);
		// find duplicates only
		 System.out.println("iiiiiii");
		Set<Integer> setarr=new HashSet<>();
		mylist.stream().filter(n -> !setarr.add(n)).forEach(System.out::println);
		
		//mylist.stream().findFirst().ifPresent(System.out::println);
		//count how meny
		long count=mylist.stream().count();
		//System.out.println(count);
		//find max number
		int max=mylist.stream().max(Integer::compare).get();
		//System.out.println(max);
		
		
		

	}
}
