package com.oct.it;


import java.util.Arrays;

public class RotateArrayNPositionJava8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int positions = 2;

        int[] rotateArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int newPosition = (i + positions) % arr.length;
            if (newPosition < 0) {
                newPosition += arr.length; // Handle negative positions
            }
            rotateArr[newPosition] = arr[i];
        }

        System.out.println("Rotate Array");

        Arrays.stream(rotateArr).forEach(num -> System.out.print(num + " "));
    }
}
