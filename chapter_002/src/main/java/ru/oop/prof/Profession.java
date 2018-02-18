package ru.oop.prof;

import ru.oop.prof.dopclass.Education;
import ru.oop.prof.dopclass.Sex;

public class Profession {
    private String name;
    private ru.oop.prof.dopclass.Sex sex;
    private int experience;
    private Education education;
    public Profession(String name, Sex sex, int experience, Education education) {
        this.name = name;
        this.sex = sex;
        this.experience = experience;
        this.education = education;
    }

    public Profession() {
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
