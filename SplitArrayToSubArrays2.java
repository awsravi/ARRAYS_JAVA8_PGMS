package com.dimensional.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArrayToSubArrays2 {
	
		public static void main(String[] args) {
			int[] original = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			int splitSize = 3;

			List<int[]> list = splitArray(original, splitSize);
			list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
		}

		public static List<int[]> splitArray(int[] array, int splitSize) {
			List<int[]> answer = new ArrayList<>();
			int count = 0;
			int[] temp = new int[splitSize];
			int n = array.length;
			int dummy = -1;

			for (int i = 0; i < n; i++) {
				temp[count] = array[i];
				count++;

				if (count == splitSize) {
					answer.add(temp);
					count = 0;
					temp = new int[splitSize];
				}
				if (n - i <= splitSize && count == 1) {
					dummy = i;
					break;
				}

			}
			if (dummy != -1) {
				temp = new int[n - dummy];
				//
				
				int res = n - dummy;
				int ind = 0;
				for (int i = dummy; i <= n; i++) {
					temp[ind] = array[i];
					ind++;
					if (ind == res) {
						break;
					}

				}
				answer.add(temp);
			}
			return answer;
		}
	}

	/*
	 * expected Output [0, 1, 2] [3, 4, 5] [6, 7, 8] [9 10]
	 */


