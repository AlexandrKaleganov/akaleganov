package ru.oop.chess.exception;

public class FigureNotFoundException  extends UnsupportedOperationException {
   public FigureNotFoundException() {
        super("В заданной ячейке фигура отсутствует");
    }
}
