package ru.oop.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("####");
        pic.append("####");
        pic.append("####");
        pic.append("####");
        return pic.toString();
    }
}