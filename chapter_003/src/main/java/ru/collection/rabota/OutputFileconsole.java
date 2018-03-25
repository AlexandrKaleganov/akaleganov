package ru.collection.rabota;
/**
 * этот класс бует выводить закидывать считанное в консоль
 */

import ru.collection.rabota.interfaceprogramm.OutputInterfac;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class OutputFileconsole implements OutputInterfac {
    @Override
    public void conclusion(BufferedReader readFile) {
//        ArrayList<String> fullData = new ArrayList<>();
//        try {
//            while (readFile.readLine()!=null) {
//                fullData.add(readFile.readLine());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String lessen = null;
        try {
            lessen = readFile.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }  System.out.println(lessen + "\t");
//        System.out.println(fullData + "\t");
    }
}
