package com.oct.it;

import java.util.Arrays;

public class MissingNumbersJava8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7};
        int n = arr.length + 1;

        int expectedSum = (n * (n + 1)) / 2;

        int actualSum = Arrays.stream(arr).sum();

        int missingNum = expectedSum - actualSum;

        System.out.println("Missing Num: " + missingNum);
    }
}
