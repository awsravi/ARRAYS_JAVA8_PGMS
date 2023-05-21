
package com.kaygen;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RearrangePositiveArraysStreams {

	public static int[] rearrange(int[] nums) {
		int[] negatives = Arrays.stream(nums).filter(n -> n < 0).toArray();
		int[] positives = Arrays.stream(nums).filter(n -> n > 0).toArray();
		int[] result = IntStream.range(0, nums.length).mapToObj(i -> {
			if (i % 2 == 0) {
				return negatives[i / 2];
			} else {
				return positives[(i - 1) / 2];
			}
		}).mapToInt(Integer::intValue).toArray();
		if (result[0] > 0) {
			int firstNegativeIndex = IntStream.range(0, result.length).filter(i -> result[i] < 0).findFirst()
					.orElseThrow();
			int temp = result[0];
			result[0] = result[firstNegativeIndex];
			result[firstNegativeIndex] = temp;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -3, -1, 2, 5, -2, 4 };
		int[] result = rearrange(nums);
		System.out.println(Arrays.toString(result)); // [-3, 2, -1, 5, -2, 4]
	}
}
