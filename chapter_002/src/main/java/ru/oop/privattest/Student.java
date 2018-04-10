package ru.oop.privattest;

public class Student extends Human {

    public Student(String name, int rost) {
        super(name, rost);
    }

    //    public static String statTest(int k){
//        return "rer";
//
//    }
    public void say(String slovo) {
        System.out.println(slovo);
    }

    private void intelect2() {
    }

    public static void main(String[] args) {
        Student vasia = new Student("sadas", 54);
        Student.statTest();
        int l = Student.getK();
    }

    final public void her() {

    }
}
