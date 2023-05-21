package com.dimensional.array;

public class TwoDArrayEnhanceLoop {
	public static void main(String[] args) {

		// navin

		int nums[][] = new int[3][3];

		int ran = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				nums[i][j] = (int) (Math.random() * 10);

			}
		}
		//normal loop
       /*
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		*/
		//Enhanced loop
		for(int n[] :nums) {
			for(int m:n) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
		
	}
}
