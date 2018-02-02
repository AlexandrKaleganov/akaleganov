package ru.job4j.array;

/**
 * @author Alexander Kaleganov
 * @version 10.10
 * @since 02.02.2018
 */
public class FindLoop {
    public int indexOf(int[]armass, int el) {
        int rsl = -1;
        int k = 0;    //переменная k у нас будет первым индексом
        for (int i:armass) { // используему цикл FOReach , чтобы не вывалиться за пределы массива
            if (armass[k] == el) {
                rsl =k;       //присваиваем индекс элемента
            } k++;        // с каждым кругом интдекс увеличиваем на 1
        } return rsl;
    }
}
