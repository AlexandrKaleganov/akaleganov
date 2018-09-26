package ru.job4j.chess;

import ru.job4j.chess.exception.ImpossibleMoveException;

public class Slon extends Figure {

    public Slon(Cell begincoordinat) {
        super(begincoordinat);
    }

    public Slon() {
        super();
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
        if ((x > dest.getX() ? x - dest.getX() : dest.getX() - x) == (y > dest.getY() ? y - dest.getY() : dest.getY() - y)) {
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
        } else {
            throw new ImpossibleMoveException();
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
