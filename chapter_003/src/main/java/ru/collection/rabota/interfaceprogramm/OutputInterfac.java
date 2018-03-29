package ru.collection.rabota.interfaceprogramm;

import java.io.FileReader;
import java.util.List;

public interface OutputInterfac {

    public void conclusion(List readFile);
    public void conclusion(FileReader reader);
}
