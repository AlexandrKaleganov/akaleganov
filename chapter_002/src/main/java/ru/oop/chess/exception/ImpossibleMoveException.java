package ru.oop.chess.exception;

/**
 * ошибка фигура туда пойти не может
 */

public class ImpossibleMoveException extends UnsupportedOperationException {


    public ImpossibleMoveException() {
        super("Фигура туда пойти не может");
    }
}
