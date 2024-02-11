package com.teachmeskills.lesson9.task2.util;

public class Util {
    public static void showMatrix(int[][] matrix) {
        for (int[] showMa : matrix) {
            for (int showMb : showMa)
                System.out.print(showMb + " ");
            System.out.println();
        }
    }
}
