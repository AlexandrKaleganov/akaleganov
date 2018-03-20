package ru.oop.privatTest;

abstract class Human {
    private String name;
    private int rost;

    public Human(String name, int rost){
        this.name = name;
        this.rost = rost;
    }
    abstract void say(String slovo);
    public static void mens(){

    }


}
