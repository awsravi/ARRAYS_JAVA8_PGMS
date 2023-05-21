package com.dimensional.array;

public class Array2D {
	public static void main(String[] args) {

		int rows = 3;
		int columns = 3;
		int value=1;
		
		int [][] arrays=new int[3][3];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arrays[i][j] = value;
				value++;
			}
		}

		System.out.println("The 2D array is: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arrays[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}