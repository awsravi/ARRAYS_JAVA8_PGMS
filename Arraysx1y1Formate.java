package com.kaygen;

import java.util.Arrays;

public class Arraysx1y1Formate {
	public static void main(String[] args) {
		int[] nums = { 2, 5, 1, 3, 4, 7, 10, 8, 9 };
		int[] result = rearrangeArray(nums);
		System.out.println(Arrays.toString(result));
	}
	public static int[] rearrangeArray(int[] nums) {

		int n = nums.length / 3;
		int[] result = new int[nums.length];
		int idx = 0;

		for (int i = 0; i < n; i++) {
			result[idx++] = nums[i];
			result[idx++] = nums[n + i];
			result[idx++] = nums[2 * n + i];
		}

		return result;
	}

}
