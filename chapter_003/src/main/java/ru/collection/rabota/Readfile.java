package ru.collection.rabota;
/**
 * этот класс будет вызывать мобъект класса Validway и принимать готовый буфер,
 * то что будет происходить в самом классе проверка пути имя говорит само за себя
 */

import ru.collection.rabota.interfaceprogramm.Inputmenu;

import java.io.*;


public class Readfile implements Inputmenu {



    @Override
    public BufferedReader input() {
         BufferedReader buffer = null;
        System.out.println("укажите путь к файлу, паример \"file//google.csv\"");
        buffer = new Validway().inputTestfile();
        return  buffer;
    }

}
