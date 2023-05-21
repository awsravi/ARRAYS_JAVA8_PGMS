package com.java.array8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupArrEleUsingSet {
public static void main(String[] args) {
	
	Integer[] arr= {1,2,3,4,5,6,6,7,7,8,8};
	List<Integer> list=Arrays.asList(arr);
	Set<Integer> setList=list.stream().collect(Collectors.toSet());
	System.out.println(setList);
	
	
}
}
