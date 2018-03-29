package ru.collection.rabota;
/**
 * чтение файла
 */

import com.sun.xml.internal.fastinfoset.util.CharArray;
import jdk.internal.util.xml.impl.Input;
import ru.collection.rabota.interfaceprogramm.Inputmenu;
import ru.collection.rabota.interfaceprogramm.OutputInterfac;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class ReadFile {
    private Inputmenu input = new InputFile();
    private OutputInterfac output = new OutputFileconsole();
    private LinkedList<String> fulllist = new LinkedList<>();
    FileReader bufer ;

    public void addBuferToList(String way) {
        boolean exit = true;
        Scanner scan = null;
        String list = null;

        do {
            if (way.contains("exit")) {
                System.exit(0);
            } else {
                try {
                    bufer =  new FileReader(way);
                    System.out.println("Файл найден, начинаю читать");
                    exit = false;
            } catch (FileNotFoundException e) {
                this.addBuferToList(this.input.input("файл не найден, повторите попытку ввода, или введите \"exit\", для выхода из программы"));
            }
        } } while (exit);
        int c;
            try {
                while((c=bufer.read())!= -1){
                    System.out.println((char)c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public LinkedList<String> getFulllist() {
        return fulllist;
    }

    public void zapusc() {
        Scanner sc = new Scanner(System.in);

        this.addBuferToList(this.input.input(null));
//        System.out.println("чтение файла окончено, начинаю выводить в консоль? y/n");
//        if (sc.nextLine().contains("y")) {
//            this.output.conclusion(this.fulllist);
//        } else {
            System.out.println("программа завершила работу");
//        }
    }

    public static void main(String[] args) {
        new ReadFile().zapusc();

    }

}


