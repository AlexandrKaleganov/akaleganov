package ru.oop.tracker.modules;

import java.util.Date;
import java.util.Random;

/**
 * Класс итемс это сама заявка, точнее один элемент заявки
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
    private Random rn = new Random();

    /**
     * в конструкторе при создании я добавил только имя завки и описание
     * всё остальное добавляется автоматом,комментарии к заявке я не стал пока добавлять
     * эти данные мы наверно будетм как то потом вносить , как пока не знаю
     * id - генерируется методом generate
     * @param name
     * @param desc
     */
    public Items(String name, String desc) {
        this.id = generate();
        this.name = name;
        this.desc = desc;
        this.created = millisreturn();
    }

    /**
     * возвращает имя заявки
     * @return
     */
    String getName() {
        return name;
    }

    /**
     * возвращает дату в виде long
     * @return
     */
    long getCreated() {
        return created;
    }

    /**
     * возвращает описание заявки
     * @return
     */
    String getDesc() {
        return desc;
    }

    /**
     * возвращает id заявки
     * @return
     */
    String getId() {
        return id;
    }

    /**
     * меняет id  заявки
     * @param newId
     */
    void setId(String newId) {
        this.id = newId;
    }

    /**
     * переопределил метод toString,
     * чтобы мы могли сразу выводить необходимые данные о нашей заявки на печать , в этом ж методе для пользователя я отображаю
     * не поле created  а new Date(created) - не знаю на сколько правильно написал, но он выводит какую то дату.
     * @return
     */
    public String toString() {
        return this.id + " -- " + this.name + " -- " + desc + " -- " + new Date(created);
    }

    /**
     * генерацию id  я  перенёс в этот класс мне это показалось более логичным
     * @return
     */
    private String generate() {
        String id =  String.valueOf(millisreturn() + rn.nextInt() * 100);
        return id;
    }

    /**
     * если я правильно понял мы тут получаем время в милисекундах текущее
     * @return
     */
    private long millisreturn() {
        long k = System.currentTimeMillis();
        return k;
    }

}
