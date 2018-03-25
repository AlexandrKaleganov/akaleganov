package ru.collection.rabota;

import ru.collection.rabota.interfaceprogramm.Inputmenu;
import ru.collection.rabota.interfaceprogramm.OutputInterfac;

import java.io.FileNotFoundException;

public class StartPO {
    public static void main(String[] args) {
        Inputmenu rid = new Readfile();
        OutputInterfac out = new OutputFileconsole();
        try {
            out.conclusion(rid.input("file//google.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
