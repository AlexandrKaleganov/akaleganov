package ru.job4j.arr2;

public class Intmass {
    public static int chetnieChisla(int arr[]) {
        int l = 0;
        for (int i = 0; i < arr.length; i++) {

            l = arr[i] % 2 > 0? i+arr[i] : i+0;
        }return l;
    }
}


