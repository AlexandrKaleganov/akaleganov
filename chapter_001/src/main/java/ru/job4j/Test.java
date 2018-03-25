package ru.job4j;


public class Test {
    public static void main(String[] args) {
        Test.Expected.Value();
    }
static class Expected{
    static int l;
    public static void Value(){
        System.out.println("локальый класс может содержать статические поля и методы");
    }
  }
}