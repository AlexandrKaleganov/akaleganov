package ru.collection.rabota;
/**
 * чтение файла
 */

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.LinkedList;


public class ReadFile {
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


