package ru.oop.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {
    Scanner scanner = new Scanner(System.in);
    @Override
    public String inputCommand(String command) {
        System.out.println(command);
        return scanner.nextLine();
    }
}
