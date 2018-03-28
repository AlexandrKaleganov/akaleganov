package ru.collection.rabota;
/**
 * меню ввода файла
 */

import ru.collection.rabota.interfaceprogramm.Inputmenu;

import java.io.*;


public class Readfile implements Inputmenu {

    @Override
    public BufferedReader input() {
        BufferedReader buffer = null;
        System.out.println("укажите путь к файлу, паример \"file//google.csv\"");
        buffer = new Validway().inputTestfile();
        return buffer;
    }

}
