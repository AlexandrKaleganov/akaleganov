package ru.collection.rabota.interfaceprogramm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

public interface Inputmenu {
    public BufferedReader input (String file) throws FileNotFoundException;
}
