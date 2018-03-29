package ru.collection.rabota;
/**
 * этот класс бует  закидывать считанное в консоль в цикле
 * надо будет додумать как раскдывать файл по таблице
 */


import ru.collection.rabota.interfaceprogramm.OutputInterfac;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class OutputFileconsole implements OutputInterfac {

    @Override
    public void conclusion(List readFile) {
        System.out.println(readFile);
    }

    @Override
    public void conclusion(FileReader reader) {
        int c;
        try {
            while ((c = reader.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
