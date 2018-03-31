package ru.collection.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Конвертация листа массивов в один лист Integer
 */
public class Convertlisttomas {

    public List convert(ArrayList list) {
        List<Integer> returnList = new ArrayList<>();
        Iterator<int[]> iterator = list.iterator();
        while (iterator.hasNext()) {
            for (Integer i :
                    iterator.next()) {
                returnList.add(i);
            }
        }
        return returnList;
    }
}
