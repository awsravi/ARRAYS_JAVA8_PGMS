package com.kaygen;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Arraysx1y1FormateStreams {

	public static void main(String[] args) {
		int[] nums = { 2, 5, 1, 3, 4, 7, 10, 8, 9 };
		int[] result = rearrangeArray(nums);
		System.out.println(Arrays.toString(result)); // prints [2, 3, 10, 5, 4, 8, 1, 7, 9]

	}

	 public static int[] rearrangeArray(int[] nums) {
		int n = nums.length / 3;
		return IntStream.range(0, n).flatMap(i -> IntStream.of(nums[i], nums[n + i], nums[2 * n + i])).toArray();
	}

}
