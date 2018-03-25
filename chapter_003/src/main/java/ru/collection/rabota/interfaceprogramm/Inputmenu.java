package ru.collection.rabota.interfaceprogramm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public interface Inputmenu {
    public BufferedReader input (String file) throws FileNotFoundException;
}
