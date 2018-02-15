package ru.job4j.array;

public class ArraysX2Sort {
    public static int[] SsortirovkaMassiva(int[]ar1, int[]ar2){
        int[]ar3 = new int[ar1.length+ar2.length];
        int k =0;
        for (int i = 0; i < ar3.length - 1; i+=2) {
            if (ar1[k]<ar2[k]){
                ar3[i] = ar1[k];
                ar3[i+1]= ar2[k];
            } else {
                ar3[i] = ar2[k];
                ar3[i+1]= ar1[k];
            } k++;

        }
        return ar3;
    }
}
