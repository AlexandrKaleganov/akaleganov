package ru.collection.convertlistinmap;

import java.util.Random;

public class User {
    private static Random rn = new Random();
    private Integer id;
    private String name;
    private String city;

    @Override
    public String toString() {
        return "User{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    User(String name, String city) {
        this.name = name;
        this.name = city;
        this.id = generateId();
    }

    private static Integer generateId() {
        Integer res = rn.nextInt(200) + 1 + rn.nextInt(100) + 1;
        return res;

    }
}
