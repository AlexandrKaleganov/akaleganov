package ru.collection.rabota;
/**
 * этот класс будет вызывать мобъект класса Validway и принимать готовый буфер,
 * то что будет происходить в самом классе проверка пути имя говорит само за себя
 */

import ru.collection.rabota.interfaceprogramm.Inputmenu;

import java.io.*;


public class Readfile implements Inputmenu {
    private BufferedReader buffer;

    @Override
    public BufferedReader input(String command) {
        System.out.println(command);
        return buffer = new Validway().inputTestfile();
    }
}
