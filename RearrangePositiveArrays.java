package com.kaygen;

import java.util.Arrays;

public class RearrangePositiveArrays {
	public static void main(String[] args) {
		int[] nums = { -3, -1, 2, 5, -2, 4 };
		int[] result = rearrangeArray(nums);
		System.out.println(Arrays.toString(result)); // prints [-3, 2, -1, 5, -2, 4]
	}

	//Input: nums = [-3,-1,2,5,-2,4]
	// Output: [-3,2,-1,5,-2,4].
	public static int[] rearrangeArray(int[] nums) {
		int n = nums.length;
		int i = 0, j = n - 1;
		while (i < j) {
			while (i < n && nums[i] < 0) {
				i++;
			}
			while (j >= 0 && nums[j] > 0) {
				j--;
			}
			if (i < j) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		int k = 1;
		while (k < n && nums[k] < 0) {
			k += 2;
		}
		int m = 0;
		while (m < k && k < n) {
			int temp = nums[m];
			nums[m] = nums[k];
			nums[k] = temp;
			m += 2;
			k += 2;
		}
		return nums;
	}
}