package ru.oop.privatTest;

abstract class Human {
    private String name;
    private int rost;
    private static int k = 2;

    public Human(String name, int rost) {
        this.name = name;
        this.rost = rost;
    }

    abstract void say(String slovo);

    public static void mens() {

    }

    public static String statTest() {
        return "ntcn";
    }

    public static int getK() {
        return k;
    }

    public static void setK(int k) {
        Human.k = k;
    }
}
