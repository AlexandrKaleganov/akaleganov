package ru.oop.chess;

public class OccupiedWayException extends Exception {
    OccupiedWayException() {
        super("Полученный путь занят фигурами");
    }
}
