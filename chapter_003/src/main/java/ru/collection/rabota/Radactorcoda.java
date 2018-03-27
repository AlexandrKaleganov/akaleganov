package ru.collection.rabota;
/**
 * в этом классе я попробую раскидать входящую строку по параметрам ключ - значение
 */

import java.io.BufferedReader;

import java.util.Arrays;
import java.util.LinkedList;


public class Radactorcoda {
    private LinkedList<String> fulllist = new LinkedList<>();

    public void formatADDfullist(BufferedReader readFile) {
        String lessen = null;

        try {
            while ((lessen = readFile.readLine()) != null) {
                this.fulllist.addAll(Arrays.asList(lessen.split(" ")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Radactorcoda redactor = new Radactorcoda();
        Readfile rid = new Readfile();
        redactor.formatADDfullist(rid.input("введите file//google.csv"));
        System.out.println(redactor.fulllist);

            }
        }


