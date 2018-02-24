package ru.oop.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {
    Scanner scanner = new Scanner(System.in);
    @Override
    public String zaprosNavvod(String schprech) {
        System.out.println(schprech);
        return scanner.nextLine();
    }
}
