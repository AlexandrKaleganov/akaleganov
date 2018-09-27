package ru.job4j.chess;
/**
 * класс ладья для создания объекта ладья
 * пока не доработан, создавался для тестов и эксперементов
 */

import ru.job4j.chess.exception.ImpossibleMoveException;

public class Ladia extends Figure {

    public Ladia(Cell begincoordinat) {
        super(begincoordinat);
    }

    public Ladia() {
        super();
    }

    @Override
    boolean isCondition(Cell source, Cell dest) {
        boolean rsl = false;

        if (source.getX() == dest.getX() && source.getY() != dest.getY() || source.getX() != dest.getX() && source.getY() == dest.getY()) {
            rsl = true;
        }
        return rsl;
    }

    /**
     * возрващает путь пройденный фигурой
     *
     * @param source
     * @param dest
     * @return
     * @throws ImpossibleMoveException
     */
    public Cell[] way(Cell source, Cell dest) {

        Cell[] result = new Cell[8];
        int x = source.getX();
        int y = source.getY();
        int index = 0;
        while (x != dest.getX() || y != dest.getY()) {
            if (x != dest.getX()) {
                if (x < dest.getX()) {
                    x++;
                } else {
                    x--;
                }
            } else {
                if (y < dest.getY()) {
                    y++;
                } else {
                    y--;
                }
            }
            result[index++] = new Cell(x, y);
        }
        return result;
    }

    /**
     * возвращает новую фигуру с новыми координатами
     *
     * @param dest
     * @return
     */
    public Ladia figureCopy(Cell dest) {
        Ladia ladia = new Ladia(dest);
        return ladia;
    }
}
