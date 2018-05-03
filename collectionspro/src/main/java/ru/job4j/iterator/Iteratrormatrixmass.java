package ru.job4j.iterator;

import java.util.Iterator;

/**
 * итератор для двухмерного массива, делал поздно вечером и меньше переменных сделать не смог
 * метод next как и heshNext сделал универсальный для любого двухмерного массива
 */
public class Iteratrormatrixmass implements Iterator {
    final private int[][] arr;
    private int index = 0;
    private int i = 0;
    private int j = 0;

    public Iteratrormatrixmass(int[][] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        int lenghtARR = 0;  //длинна всего массива
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                lenghtARR++;
            }
        }
        return lenghtARR > index;
    }

    @Override
    public Object next() {
        int res = 0;
        if (this.i < this.arr.length && j < this.arr[i].length) {
            res = arr[i][j++];
        } else {
            j = 0;
            i++;
            res = arr[i][j++];
        }               //кажый раз когда мы берём следующий текущий элемент двухмерного массива,
        index++;        // каретка сдвигается и шаг этот отмечается в индексе чтоб потом сравнить его со всей длинной массива
        return res;
    }
}
