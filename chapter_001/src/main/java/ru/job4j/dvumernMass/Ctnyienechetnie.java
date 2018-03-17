package ru.job4j.dvumernMass;

public class Ctnyienechetnie {

    public void sortmassiv(int[][] arr, int[] a, int[] b) {
        int index_a = 0;
        int index_b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    a[index_a++] = arr[i][j];
                } else {
                    b[index_b++] = arr[i][j];
                }
            }
        }
    }
}
