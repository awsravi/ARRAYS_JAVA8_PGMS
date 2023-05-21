package com.java.array8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayMultip {
public static void main(String[] args) {
	Integer[] arr= {2,4};
	
	List<Integer> listIntegers=Arrays.asList(arr);
	List<Integer> list=listIntegers.stream().map(i ->i*i*i).collect(Collectors.toList());
	
	System.out.println(list);
}
}
