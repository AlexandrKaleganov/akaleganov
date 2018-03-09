package ru.oop.chess.exception;

public class ImpossibleMoveException extends UnsupportedOperationException {

   public ImpossibleMoveException() {
        super("Фигура туда пойти не может");
    }
}
