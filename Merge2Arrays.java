package com.awsravi.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge2Arrays {
	public static void main(String[] args) {

		
		List<Integer> List1 = Arrays.asList (1, 3, 5, 7, 7,9,9);
		List<Integer> List2 = Arrays.asList( 2, 4, 6, 8, 2,6,10);
		
		//flatmap
		 List<Integer> mergeArray=Stream.of(List1, List2).flatMap(List::stream).sorted().distinct()
				.collect(Collectors.toList());
		
		System.out.println("merged : "+mergeArray);
		
		
		//concat
		
		List<Integer> merge= Stream.concat(List1.stream(), List2.stream()).distinct().sorted().collect(Collectors.toList());
		System.out.println("merge :" +merge);
		
		//addAll
		
		List<Integer> merge1= new ArrayList<>(List1);
		merge1.addAll(List2);
		merge1.sort(Comparator.naturalOrder());
		 List<Integer> m=merge1.stream().distinct().collect(Collectors.toList());
		System.out.println("using arrayList :" +m);
		
		
		
		

	}
}
