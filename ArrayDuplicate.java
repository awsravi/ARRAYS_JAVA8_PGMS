package com.array;

import java.util.Arrays;

public class ArrayDuplicate {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,2,3,4};
	Arrays.stream(arr).distinct().forEach(System.out::println);
}
}
