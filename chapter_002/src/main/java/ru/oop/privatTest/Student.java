package ru.oop.privatTest;

public class Student extends Human {

    public Student(String name, int rost){
        super(name, rost);
    }
    public void say(String slovo){
        System.out.println(slovo);
    }
}
