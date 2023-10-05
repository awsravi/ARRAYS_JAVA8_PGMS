package com.oct.it;

public class RotateArrayNPosition {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int positions = 2; // position

		// output=4,5,1,2,3

		int[] rotateArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int newPos = (i + positions) % arr.length;
			rotateArr[newPos] = arr[i];

		}
		System.out.println("Rotate Array");

		for(int num:rotateArr) {
			System.out.print(num+" ");
		}
	
	}
}
