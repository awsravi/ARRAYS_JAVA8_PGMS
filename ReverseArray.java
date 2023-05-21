package com.java.array8;

import java.util.Arrays;

public class ReverseArray {
	
	    public static void reverse(int[] arr) {
	        for (int i = 0; i < arr.length / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[arr.length - 1 - i];
	            arr[arr.length - 1 - i] = temp;
	        }
	    }

	    public static void main(String[] args) {
	        int[] originalArray = {1, 2, 3, 4, 5};
	        System.out.println("Original array: " + Arrays.toString(originalArray));

	        reverse(originalArray);
	        System.out.println("Reversed array: " + Arrays.toString(originalArray));
	    }
	}


