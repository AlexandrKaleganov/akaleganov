package ru.collection.rabota;
/**
 * этот класс бует  закидывать считанное в консоль в цикле
 * надо будет додумать как раскдывать файл по таблице
 */


import ru.collection.rabota.interfaceprogramm.OutputInterfac;

import java.util.List;

public class OutputFileconsole implements OutputInterfac {

    @Override
    public void conclusion(List<String> readFile) {
        System.out.println(readFile);
    }
}
