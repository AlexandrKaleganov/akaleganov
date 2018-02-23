package ru.oop.tracker.modules;

import java.util.Date;

/**
 *Класс итемс это сама заявка, точнее один элемент заявки
 * в конструкторе при создании я добавил только имя завки и описание
 * всё остальное добавляется автоматом,комментарии к заявке я не стал пока добавлять
 * эти данные мы наверно будетм как то потом вносить , когда будем делать мен ввода
 * id - генерируется методом generate генерацию id  я  перенёс в этот класс мне это показалось более логичным
 * создаётся элемент, и у него сразу появляется уникильный идентификатор, а то если всё понапихать в класс трекер там потом
 * чёрт ногу сломит. name - это имя заявки, desc  - описане , также я переопределил метод toString,
 * чтобы мы могли сразу выводить необходимые данные о нашей заявки на печать , в этом ж методе для пользователя я отобрааю
 * не поле created  а new Date(created) - не знаю на сколько правильно написал, но он выводит какую то дату.
 * Решая эту задачу я побольше узнал о методе toString и на сколько он удобен, также узнал про то что лонг может хранить
 * необхоимую дту, а с помощью некоторых методов из длинного числа long  мы можем получить дату для того чтобы пользователю
 * было понятно отоброжаемое
 */

public class Items {
    private String id;
    private String name;
    private String desc;
    private long created;
    private String[] comments = new String[20];

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

     void setId(String newId) {
        this.id = newId;
    }

    public String toString() {
        return this.id + " -- " + this.name + " -- " + desc + " -- " + new Date(created);
    }


    Items(String name, String desc) {
        this.id = generate();
        this.name = name;
        this.desc = desc;
        this.created = millisreturn();

    }
    private static String generate() {
        String id =  String.valueOf(millisreturn() + ((int)(0 + Math.random() * 100)));
        return id;
    }

    private static long millisreturn() {
        long k = System.currentTimeMillis();
        return k;
    }

}
