package com.java.array8;

import java.util.Arrays;

public class RemoveDupArray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,3,4,5};
	Arrays.stream(arr).distinct().forEach(System.out::println);
}
}
