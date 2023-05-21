package com.kaygen;

import java.util.Arrays;

public class MoveAllPositiveNumbersArrayStreamsAPI {

	public static void main(String[] args) {
		int[] arr = { -1, 2, -3, 4, 5, -6 };

		int[] result = Arrays.stream(arr).boxed()
				.sorted((a, b) -> Integer.compare(a >= 0 ? 1 : 0, b >= 0 ? 1 : 0))
				.mapToInt(Integer::intValue).toArray();

		System.out.println(Arrays.toString(result));
	}
}
