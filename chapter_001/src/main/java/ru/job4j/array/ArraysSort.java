package ru.job4j.array;

public class ArraysSort {
    public static int[]   ArraysSortDva(int[]ar1, int[]ar2){
        int temp = 0;
        int[] ar3 = new int[ar1.length + ar2.length];
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1.length; j++) {
                if (ar1[i] < ar1[j] && ar1[i]< ar2[j]) {
                    ar3[i] = ar1[i];
                } else if (ar1[i] > ar1[j] && ar2[i]> ar2[j]) {
                    ar3[i] = ar1[j]<ar2[j]?ar1[j]:ar2[j];
                }else {
                    ar3[i] = ar2[j];

                }
            }

        }
        return ar3;
    }
}
