package ru.oop.chess;

public class FigureNotFoundException  extends Exception {
    FigureNotFoundException() {
        super("В заданной ячейке фигура отсутствует");
    }
}
