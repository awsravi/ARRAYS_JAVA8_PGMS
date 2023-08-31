package com.interview.ques;

import java.util.Arrays;
import java.util.List;

public class Count1s0sUsingstreams {

	public static void main(String[] args) {
	String str="1,1,0,0,1,0,1,0,1";
	//string way
	long out1=str.chars().filter( f -> f=='1').count();
	long oout2=str.chars().filter(o -> o=='0').count();
	System.out.println("count 1s :"+out1 +" : "+ "count 0s"+ oout2);
	//List of Integers 
	List<Integer> lint=Arrays.asList(1,1,0,0,1,0,1,0,1);
	Map<Integer, Long> counts=lint.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
	System.out.println(counts);





		
		//wrong just trickky way only 0s and 1s
		Integer[] arr= {1,0,1,0,0,1,1,1,0};
		List<Integer> list=Arrays.asList(arr);
		Integer sum=list.stream().reduce(0,Integer::sum);
		System.out.println("numbers of 1s :"+sum);
		System.out.println("no of 0s :"+(list.size()-sum));
		
	}
}
