package ru.job4j.array;

import static java.lang.Math.*;

/**
 * @author  Alexander Kaleganov
 * @version Array V 1.0
 * @since 01.02.18
 */


public class Square {

    public int[]  calculate(int bound) {  //метод присваения массивам значения через цикл FOR i
        int[] rsl = new int[bound];
        for (int i = 0; i < bound; i++) {
            rsl[i] = (int)pow((i + 1), 2);
        } return rsl;
    }

//    public int[] calculateV2(int bound) { //метод присваения массивам значения через цикл FOReach
//        int index = 0;
//        int[] rsl = new int[bound];
//        for (int i:rsl) {                 // через FORi проще обращаться к индексам
//            rsl[index] = (int)pow((index + 1), 2);
//            index++;
//        }
//        return rsl;
//    }
}
