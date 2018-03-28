package ru.collection.rabota;
/**
 * в этом классе я попробую раскидать входящую строку по параметрам ключ - значение
 * в данном классе у нас будет осуществляться основная работа программы
 */

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.LinkedList;


public class Redactorcoda {
    private LinkedList<String> fulllist = new LinkedList<>();

    public void addBuferToList(BufferedReader readFile) {
        String lessen = null;

        try {
            while ((lessen = readFile.readLine()) != null) {
                this.fulllist.addAll(Arrays.asList(lessen.split(" ")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public LinkedList<String> getFulllist() {
        return fulllist;
    }

}


