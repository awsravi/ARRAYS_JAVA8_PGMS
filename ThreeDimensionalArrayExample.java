package com.kaygen;
public class ThreeDimensionalArrayExample {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int z = 4;
        int[][][] cube = new int[x][y][z];
        
        // initialize the cube
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    cube[i][j][k] = i * y * z + j * z + k + 1;
                }
            }
        }
        
        // print the cube
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
