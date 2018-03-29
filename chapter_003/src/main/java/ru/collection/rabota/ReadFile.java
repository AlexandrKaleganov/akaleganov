package ru.collection.rabota;
/**
 * чтение файла
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class ReadFile {
    private LinkedList<String> fulllist = new LinkedList<>();

    public void addBuferToList(String way) {
        boolean exit = true;
        Scanner scan = null;
        do {
            if (way.contains("exit")){
                System.exit(0);
            } else {


        try {
             scan=new Scanner(new File(way));
            System.out.println("Файл найден, начинаю читать");
            exit = false;
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден, повторите попытку ввода, или введите \"exit\", для выхода из программы");;
        }
            }
        } while (exit);
        while (scan.hasNextLine()){
            fulllist.add(scan.nextLine());
        }

    }

    public LinkedList<String> getFulllist() {
        return fulllist;
    }

}


