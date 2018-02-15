package ru.job4j.array;

public class ArraysX2Sort {
    public static int[] SsortirovkaMassiva(int[]ar1, int[]ar2){
        int[]ar3 = new int[ar1.length+ar2.length];
        int k =0;  //длина первого массив для первого прогона чтобы не вывалится за пределы

        int r =0;  //длина первого массив для первого прогона чтобы не вывалится за пределы

        for (int i = 0; i <ar3.length ; i++) {
            if (k<ar1.length){
                for (int j = 0; j <ar1.length ; j++) {
                    if (ar1[k]<=ar1[j]&& ar1[k]<=ar2[j]){
                            ar3[i]=ar1[k];
                        } else {
                            ar3[i]=ar1[k]<ar2[j]?ar1[k]:ar2[j];
                    }
                }k++;
            } else if (r< ar2.length){
                for (int j = 0; j < ar2.length; j++) {
                    if (ar2[r]<=ar1[j]&& ar2[r]<=ar1[j]){
                        ar3[i]=ar2[r];
                    } else {
                        ar3[i]=ar2[r]<ar1[j]?ar2[r]:ar1[j];
                    }
                }
                r++;
            }
        }
        return ar3;
    }
}
