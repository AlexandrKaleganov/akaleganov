package ru.oop.chess;
/**
 * класс ладья для создания объекта ладья
 * пока не доработан, создавался для тестов и эксперементов
 */

import ru.oop.chess.exception.ImpossibleMoveException;

public class Ladia extends Figure {



    public Ladia(Cell begincoordinat) {
        super(begincoordinat);
    }
    public Ladia() {
        super();
    }

    /**
     * возрващает путь пройденный фигурой
     * @param source
     * @param dest
     * @return
     * @throws ImpossibleMoveException
     */
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        Cell[] result = new Cell[8];
//        if (source.x)
//        for (int i = 0; i < ; i++) {
//
//        }
        return result;
    }

    /**
     * возвращает новую фигуру с новыми координатами
     * @param dest
     * @return
     */
    public Figure figureCopy(Cell dest) {
        Ladia ladia = new Ladia(dest);
        return ladia;
    }
}
