package ru.oop.privatTest;

public class Klass {
    private Student[] spisok = new Student[10];
    private int i = 0;
    public Klass(Student student){
        this.spisok[i++] = student;
        student.say("sada");
        student.her();
    }
     public Klass(){

    }
}
