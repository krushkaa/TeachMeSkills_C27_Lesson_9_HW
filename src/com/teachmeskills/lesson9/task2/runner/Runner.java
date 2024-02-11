package com.teachmeskills.lesson9.task2.runner;

import com.teachmeskills.lesson9.task2.operation.Matrix;
import com.teachmeskills.lesson9.task2.util.Util;

public class Runner {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] b = new int[][]{
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };
        System.out.println("Первая матрица: ");
        Util.showMatrix(a);
        System.out.println("Вторая матрица: ");
        Util.showMatrix(b);

        if(a[0].length != b.length) {
            System.out.println("Умножение матриц невозможно");
            return;
        }

        System.out.println("Их произведение: ");
        Util.showMatrix(Matrix.doubleMatrix(a,b));

    }
}
