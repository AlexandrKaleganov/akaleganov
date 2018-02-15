package ru.job4j.array;

public class ArraysX2Sort {
    public static int[] SsortirovkaMassiva(int[]ar1, int[]ar2){
        int[]ar3 = new int[ar1.length+ar2.length];
        int k =0;  //длина первого массив для первого прогона чтобы не вывалится за пределы
        int k2 =0; //длина второго массива для первого прогона чтобы не вывалится за пределы
        int r =0;  //длина первого массив для первого прогона чтобы не вывалится за пределы
        int r2 =0; //длина второго массива для первого прогона чтобы не вывалится за пределы
        for (int i = 0; i <ar3.length ; i++) {
            if (k<ar1.length){
                for (int j = 0; j <ar3.length ; j++) {
                    if (k2<ar1.length){
                        if (ar1[k]<=ar1[k2]&& ar1[k]<ar2[k2]){
                            ar3[i]=ar1[k];
                        } else {
                            ar3[i]=ar1[k2]<ar2[k2]?ar1[k2]:ar2[k2];
                        }
                    } else if (r< ar2.length){

                    }k2++;

                }}k++;

        }
        return ar3;
    }
}
