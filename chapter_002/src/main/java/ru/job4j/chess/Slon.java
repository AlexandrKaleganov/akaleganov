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
        int index=0;
        boolean exit = true;
        while (x != dest.getX() && y!=dest.getY()){
            if (source.hashCode() == dest.hashCode()) {
                result[0] = source;
                break;
            } else if (source.getX() != dest.getX() && source.getY() != dest.getY()) {
                result[index++] = new Cell(x < dest.getX() ? x++ : x--, y < dest.getY() ? y++ : y--);
            }
            if (x == dest.getX() && y != dest.getY() || x != dest.getX() && y == dest.getY()) {
                exit = false;
                break;
            }
        }
        if (exit) {
            return result;
        } else {
            throw new ImpossibleMoveException();
        }
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
