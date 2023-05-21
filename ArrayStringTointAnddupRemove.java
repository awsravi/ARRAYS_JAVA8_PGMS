package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayStringTointAnddupRemove {
public static void main(String[] args) {
	String[] arr=  {"1","2","3","4","5","4","2"};
	List<Integer> air=Arrays.stream(arr).map(Integer::parseInt).distinct().collect(Collectors.toList());
	System.out.println(air);
}
}
