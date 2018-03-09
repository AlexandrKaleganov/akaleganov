package ru.oop.chess.exception;

/**
 * Полученный путь занят фигурами
 */

public class OccupiedWayException extends UnsupportedOperationException {

    public OccupiedWayException() {
        super("Полученный путь занят фигурами");
    }
}
