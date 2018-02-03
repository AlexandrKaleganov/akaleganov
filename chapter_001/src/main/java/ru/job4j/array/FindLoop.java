package ru.job4j.array;

/**
 * @author Alexander Kaleganov
 * @version 10.11
 * @since 03.02.2018
 */
public class FindLoop {
    public int indexOf(int[]armass, int el) {
        int rsl = -1;
        for (int i = 0; i < armass.length ; i++) {
            if (armass[i] == el) {
                rsl = i;       //присваиваем индекс элемента      с каждым кругом интдекс увеличиваем на 1
            }
        } return rsl;
    }
}
