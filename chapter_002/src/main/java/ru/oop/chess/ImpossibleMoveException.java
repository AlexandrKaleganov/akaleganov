package ru.oop.chess;

public class ImpossibleMoveException extends Exception {

    ImpossibleMoveException() {
        super("Фигура туда пойти не может");
    }
}
