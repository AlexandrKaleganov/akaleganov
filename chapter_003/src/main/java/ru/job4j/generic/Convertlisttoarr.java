package ru.job4j.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Конвертация листа массивов в один лист Integer
 */

public class Convertlisttoarr {

    /**
     * @param list
     * @return
     */
    public List<Integer> convert(List<int[]> list) {
        List<Integer> returnList = new ArrayList<>();
        for (int[]k:list) {
            for (Integer n:k) {
                returnList.add(n);
            }
        }
        return returnList;
    }
}
