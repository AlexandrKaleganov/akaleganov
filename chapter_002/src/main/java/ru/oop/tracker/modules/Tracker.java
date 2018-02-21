package ru.oop.tracker.modules;

import java.util.*;

public class Tracker {
    private Items[] items = new Items[100];
    private int index = 0;


    public Items add(Items items){
        items.setId(generate());
        this.items[index++] = items;
        return items;
    }

    private static String generate(){
        Date date  = new Date();
        int generator = (int)(0 + Math.random()*100);
        String id = date.toString() + String.valueOf(generator);
        return id;
    }

    public void replace(String id, Items items){

    }

    public void delete(String id){


    }

    public Items[] findAll(){
        return items;
    }

    public Items fidBlid(String id) {
        Items items = null;
        return items;
    }

}
