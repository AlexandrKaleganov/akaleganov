package ru.job4j.dvumernMass;

import java.util.Arrays;

public class MetodReshenia {

    public int returnresult(int[][] arr) {
        int result = 0;
        boolean exit = true;
        int kvadrat = 0;


        do {
            int[][] arrTemp = new int[arr.length - kvadrat][arr[1].length - kvadrat];
            for (int i = 0 + kvadrat; i < arr.length - kvadrat; i++) {
                System.out.println(" ");
                for (int j = 0 + kvadrat; j < arr[i].length - kvadrat; j++) {
                    arrTemp[i][j] = arr[i][j];
                    System.out.print(arrTemp[i][j] + "  ");
                }
            }

            result = result + (getMax(arrTemp) - getMin(arrTemp));
            kvadrat++;
            if (arrTemp.length == 1) {
                exit = false;
            }
        } while (exit);

        return result;
    }

    public int getMin(int arr[][]) {
        int min = 1;
        for (int[] arr2 : arr) {
            for (int vol : arr2) {
                if (vol != 0 && min > vol) {
                    min = vol;

                }
            }
        }
        return min;
    }

    public int getMax(int arr[][]) {
        int max = 1;
        for (int[] arr2 : arr) {
            for (int vol : arr2) {
                if (max < vol) {
                    max = vol;
                }
            }
        }
        return max;
    }

}

