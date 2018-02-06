package ru.job4j.array;
/**
 * @a
 */

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int krug = array.length;
        for (int i = 0; i < krug; i++) {
            for (int j = 0; j < krug; j++) {
                if (i != j) {                          // проверяем чтоб элемент сам себя не сравнвал
                    if (array[i] == array[j]) {
                        array[j] = array[array.length - 1];
                        krug--;
                    }
                }
            }
        }
        return Arrays.copyOf(array, krug);
    }
}