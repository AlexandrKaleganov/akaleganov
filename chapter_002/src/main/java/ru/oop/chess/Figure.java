package ru.oop.chess;

import javafx.scene.control.Cell;

/**
 * @author Alexander KAleganov
 * тут мы будем описывать абстрактное поведение игуры
 * как я понял абстрактные классы это практически те же интерфейсы, только мы
 * можем реализовывать методы
 */
public abstract class Figure {

    private final Cell position;

    Figure(Cell position) {
        this.position = position;
    }
    abstract Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException;

    abstract Figure figureCopy(Cell dest);


}
