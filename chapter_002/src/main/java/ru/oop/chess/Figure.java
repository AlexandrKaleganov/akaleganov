package ru.oop.chess;

import javafx.scene.control.Cell;

/**
 * @author Alexander KAleganov
 * тут мы будем описывать абстрактное поведение вигуры
 * как я понял абстрактные классы это практически те же интерфейсы, только мы
 * можем реализовывать методы
 */
public abstract class Figure {
    final Cell position = new Cell();
//    Cell[] way(Cell source, Cell dest) throw ImposibleMoveException;

}
