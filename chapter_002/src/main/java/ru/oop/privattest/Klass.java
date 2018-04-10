package ru.oop.privattest;

public class Klass {
    private Student[] spisok = new Student[10];
    private int i = 0;

    public Klass(Student student) {
        this.spisok[i++] = student;
        student.say("sada");
        student.her();

    }

    public Klass() {

    }

    public static void main(String[] args) {
        Klass a = new Klass(new Student("vasa", 12));
        a.spisok[0].say("wqer");
    }
}
