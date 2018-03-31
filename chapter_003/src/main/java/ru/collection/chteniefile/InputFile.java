package ru.collection.chteniefile;
/**
 * меню ввода файла
 */

import ru.collection.chteniefile.interfaceprogramm.Inputmenu;

import java.util.Scanner;


public class InputFile implements Inputmenu {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String input(String command) {
        if (command != null) {
            System.out.println(command);
        } else {
            System.out.println("укажите путь к файлу, паример \"file//google.csv\"");
        }
        return scanner.nextLine();
    }
}
