package ru.job4j.array;

public class Turn {
    public int[] backArray(int[]arr123) {
        int[] arr321 = new int[arr123.length];
        int index = 0;
        for (int i = arr123.length - 1; i >= 0; i--) {
            arr321[index] = arr123[i];
            index++;
        }
        return arr321;
    }
    public int[] backArrayV2(int[]arr123) {
        int index = 0;
        Integer temp; //создадим именно ссылочную переменную, для экономии памяти
        for (int i = arr123.length - 1; i >= arr123.length / 2; i--) {
            temp = arr123[index];
            arr123[index] = arr123[i];
            arr123[i] = temp;
            index++;
        }
        return arr123;
    }
}
