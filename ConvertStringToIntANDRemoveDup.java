package com.java.array8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToIntANDRemoveDup {
	public static void main(String[] args) {

		// List<String> valueList = Array.Listas{"10","20","30","20","
		String[] arr = new String[] { "1", "2", "3", "4", "2", "3" };

		List<Integer> arrcon = Arrays.stream(arr).map(Integer::parseInt).distinct().collect(Collectors.toList());
		System.out.println(arrcon);

		String[] strArray = { "1", "2", "1" };
		List<Integer> resultList = Arrays.stream(strArray).map(Integer::parseInt).distinct()
				.collect(Collectors.toList());
		System.out.println(resultList);
		
		
		//int to string
		
	
		
		
		
		
		

	}
}
