package ru.job4j.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Конвертация листа массивов в один лист Integer
 */

public class Convertlisttoarr {

    /**
     * @param list
     * @return
     */
    public List<Integer> convert(ArrayList<int[]> list) {
          return list.stream().flatMap(e -> IntStream.of(e).boxed()).collect(Collectors.toList());
    }
}
