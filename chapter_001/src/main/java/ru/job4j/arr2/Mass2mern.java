package ru.job4j.arr2;

public class Mass2mern {

    public static void arrmassDinODINod(int arr[][]) {
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                if (arr[i][j] % 2 > 0) {
                    l++;
                }
            }
        }
        int k = 0;
        int n = 0;
        int[] arr1 = new int[l];
        int[] arr2 = new int[arr.length * arr[1].length - l];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                if (arr[i][j] % 2 > 0) {
                    arr1[k++] = arr[i][j];
                    } else {
                    arr2[n++] = arr[i][j];
                }
            }
        }
    }
}
