package ru.collection.chtenieFile;
/**
 * чтение файла
 */

import ru.collection.chtenieFile.interfaceprogramm.Inputmenu;

import java.io.*;
import java.util.Scanner;


public class ReadFile {
    private Inputmenu input = new InputFile();
    FileReader reader;

    public void fileWaySearh(String way) {
        boolean exit = true;
        do {
            if (way.contains("exit")) {
                System.exit(0);
            } else {
                try {
                    reader = new FileReader(way);
                    System.out.println("Файл найден");
                    exit = false;
                } catch (FileNotFoundException e) {
                    this.fileWaySearh(this.input.input("файл не найден, повторите попытку ввода, или введите \"exit\", для выхода из программы"));
                }
            }
        } while (exit);
    }

    public void zapusc() {
        Scanner sc = new Scanner(System.in);
        this.fileWaySearh(this.input.input(null));
        System.out.println("начинаю  читать файл по букве и выводить в консоль? y/n");
        if (sc.nextLine().contains("y")) {
            int c;
            try {
                while ((c = reader.read()) != -1) {
                    System.out.println((char) c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("программа завершила работу");
        }
    }

    public static void main(String[] args) {
        new ReadFile().zapusc();
    }

}


