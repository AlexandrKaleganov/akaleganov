package ru.job4j.array;

/**
 *@version Упорядочить елементы массива
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
        } return array;
    }
}
