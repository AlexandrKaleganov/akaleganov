package ru.oop.tracker.modules;

import java.util.*;

public class Tracker {
    private Items[] items = new Items[100];
    private int index = 0;

    public Items add(Items item){
        item.setId(generate());
        this.items[index++] = item;
        System.out.println(String.valueOf(item));
        return item;
    }
    private static String generate(){
        Date date  = new Date();
        int generator = (int)(0 + Math.random()*100);
        String id =  String.valueOf(System.currentTimeMillis() + generator);
        return id;
    }
    public void replace(String id, Items items){
        for (:
             ) {

        }

    }
    public void delete(String id){
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(id)){
                items[i] = null; }
        }
    }

    public Items[] findAll(){
        return items;
    }

    public Items getItemsIndex(int i) {
        Items result = null;
        result = this.items[i];
        System.out.println(result.getId() + " " + result.getName() + "--- " + result.getDesc() + " " + result.getCreated() );
        return result;
    }

    public Items fidBlid(String id) {
        Items items = null;
        return items;
    }

}
