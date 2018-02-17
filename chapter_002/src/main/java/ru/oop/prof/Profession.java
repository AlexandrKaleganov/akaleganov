package ru.oop.prof;

import ru.oop.prof.dopclass.Sex;

public class Profession {
    private String name;
    private ru.oop.prof.dopclass.Sex sex;
    private int experience;

    public Profession(String name, Sex sex, int experience){
        this.name = name;
        this.sex = sex;
        this.experience = experience;
    }

    public  Profession(){
    }

    public String getName() {
        return this.name;
    }

    public Sex getSex() {
        return this.sex;
    }

    public int getExperience() {
        return this.experience;
    }
}
