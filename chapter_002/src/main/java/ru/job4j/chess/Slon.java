package ru.job4j.chess;

import ru.job4j.chess.exception.ImpossibleMoveException;

public class Slon extends Figure {

    public Slon(Cell begincoordinat) {
        super(begincoordinat);
    }

    public Slon() {
        super();
    }

    @Override
    boolean isCondition(Cell source, Cell dest) {
        boolean rsl = false;

        if ((source.getX() > dest.getX() ? source.getY() - dest.getX() : dest.getX() - source.getX()) == (source.getY() > dest.getY() ? source.getY() - dest.getY() : dest.getY() - source.getY())) {

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
            if (x < dest.getX()) {
                x++;
            } else {
                x--;
            }
            if (y < dest.getY()) {
                y++;
            } else {
                y--;
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
    public Figure figureCopy(Cell dest) {
        Slon slon = new Slon(dest);
        return slon;
    }
}
