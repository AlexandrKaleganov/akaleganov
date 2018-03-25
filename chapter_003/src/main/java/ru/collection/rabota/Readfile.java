package ru.collection.rabota;
/**
 * этот класс будет только считывать файл
 */

import ru.collection.rabota.interfaceprogramm.Inputmenu;

import java.io.*;


public class Readfile implements Inputmenu {
    private BufferedReader buffer;

    @Override
    public BufferedReader input(String file) {
        try {
            buffer = new BufferedReader(new FileReader(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer;
    }
}
