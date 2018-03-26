package ru.collection.rabota;
/**
 * этот класс бует  закидывать считанное в консоль в цикле
 * надо будет додумать как раскдывать файл по таблице
 */

import ru.collection.rabota.interfaceprogramm.OutputInterfac;

import java.io.BufferedReader;

public class OutputFileconsole implements OutputInterfac {

    @Override
    public void conclusion(BufferedReader readFile) {
        String lessen = null;
        try {
            while ((lessen = readFile.readLine()) != null) {
                System.out.println(lessen);
            }
            System.out.println(lessen);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
