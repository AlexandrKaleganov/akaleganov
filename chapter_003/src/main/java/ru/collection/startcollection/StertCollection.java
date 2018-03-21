package ru.collection.startcollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.lang.String.format;

/**
 * /тестирование интерфеса List
 */
public class StertCollection {
    static class Node {
        Node next;
    }
    public static void main(String[] args) {

        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.next = second;
        second.next = third;

        List<Integer> list = new LinkedList<Integer>();
        list.add(425);
        int testint = 2;
        double testdouble = 14.16;
        list.add(testint);
        list.add((int) testdouble);
        Integer value = list.get(0);
        System.out.println(value);
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        list.add(3, 32);
        List<Integer> flats = new ArrayList<Integer>();
        flats.add(1);
        flats.add(2);
        list.addAll(flats);
        System.out.println(format("Выводим интекс элемента, начинаем искать сначала  = %s", list.indexOf(2)));
        System.out.println(format("Выводим интекс элемента, начинаем искать с конца  = %s", list.lastIndexOf(2)));
        list.remove(5); //удаляем объект по индексу
        System.out.println(format("Выводим интекс элемента, начинаем искать с конца  = %s", list.lastIndexOf(2)));
        list.remove(testint); //удаляем объект
        System.out.println(format("Выводим интекс элемента, начинаем искать сначала  = %s", list.indexOf(2)));
    }
}
