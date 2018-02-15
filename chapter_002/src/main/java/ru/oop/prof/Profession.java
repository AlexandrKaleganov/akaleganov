package ru.oop.prof;

import ru.oop.prof.dopclass.Sex;

public class Profession {
     String name;
     Sex sex;
     int experience;

    public Profession(String name, Sex sex, int experience){
        this.name = name;
        this.sex = sex;
        this.experience = experience;
    }
    public  Profession(){
        String name;
        Sex sex;
        int experience;
    }
}
