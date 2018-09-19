package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @version Упорядочить елементы массива
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        Integer temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public int[] sort2(int[] array) {
        Arrays.sort(array);
        return array;
    }

    /**
     * сортировка двумерного массива
     * @param matrix
     * @return
     */
    public int[][] sortMatrix(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix[k].length; l++) {
                        if (matrix[i][j] <= matrix[k][l]) {
                            temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }

                    }
                }
            }
        }
        return matrix;
    }
}
