package ru.collection.rabota;
/**
 * здесь будет находится метод, в котором будет вводится путь
 * в цикле будет проверятся что введено если exit,  то вызовится комманда: System.exit(0)
 * иначе программа бует требовать ввода пути к файлу, пока файл не будет найден
 */

import java.io.*;

public class Validway {

    public BufferedReader inputTestfile() {
        String way = null;
        boolean exit = true;
        BufferedReader returnBuffer = null;
        do {
            try {
                BufferedReader inputfile = new BufferedReader(new InputStreamReader(System.in));
                way = inputfile.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (way.contains("exit")) {
                System.exit(0);
            }
            try {
                returnBuffer = new BufferedReader(new FileReader(way ));
                exit = false;
            } catch (FileNotFoundException e) {
                System.out.println("файл не найден, у тебя ещё мнооого попыток, или введи exit");
            }
        } while (exit);
        return returnBuffer;
    }
}
