package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayIntToStringStartWith {
public static void main(String[] args) {
	int[] arr=new int[] {1,12,13,14,25,26,27,38,39,30};
	List<Integer> listArr =Arrays.asList(1,12,13,14,25,26,27,38,39,30);
	
	List<String> listA=listArr.stream().map(n ->n+"").filter(n ->n.startsWith("3")).collect(Collectors.toList());
	System.out.println(listA);
	
}
}
