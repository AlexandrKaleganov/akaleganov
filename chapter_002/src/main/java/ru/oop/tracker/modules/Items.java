package ru.oop.tracker.modules;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.time.ZoneOffset.UTC;
import static javax.print.attribute.standard.MediaSizeName.C;

public class Items {
    private String id;
    private String name;
    private String desc; //описание заявки
    private long created; //дата создания
    private String [] comments = new String[20];
    private String date;

    String getName() {
        return name;
    }

    long getCreated() {
        return created;
    }

    String getDesc() {
        return desc;
    }

    String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString(){
        return this.id + " -- " + this.name + " -- " + desc + " -- " + created;
    }

    public Items(String name, String desc){
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.created = millisreturn();

    }

    private static long millisreturn(){
        long k = Calendar.getInstance().getTimeInMillis();
        return k;
    }

}
