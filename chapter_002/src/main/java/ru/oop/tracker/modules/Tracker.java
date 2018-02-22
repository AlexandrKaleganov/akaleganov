package ru.oop.tracker.modules;

import java.util.*;

public class Tracker {
    private Items[] items = new Items[100];
    private int index = 0;

    public Items add(Items item){
        item.setId(generate());
        this.items[index++] = item;
        return item;
    }
    private static String generate(){
        Date date  = new Date();
        int generator = (int)(0 + Math.random()*100);
        String id =  String.valueOf(System.currentTimeMillis() + generator);
        return id;
    }
    public void replace(String id, Items items){
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)){
                this.items[i] = items;
                break;
            }

        }

    }
    public void delete(String id){
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId().equals(id)){
                items[i] = null;
                break;
            }
        }
    }

    public Items[] findAll(){
        return items;
    }

    public Items getItemsIndex(int i) {
        Items result = null;
        result = this.items[i];
        return result;
    }

    public Items fidBlid(String id) {
        Items items = null;
        return items;
    }
    public String prtintItems(Items result){
        String res = result.getId() + " " + result.getName() + "--- " + result.getDesc() + " " + result.getCreated();
        return res;
    }

}
