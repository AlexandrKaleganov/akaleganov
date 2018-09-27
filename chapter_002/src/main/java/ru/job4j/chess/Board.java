package ru.job4j.chess;

import com.sun.org.apache.xpath.internal.functions.FuncBoolean;
import ru.job4j.chess.exception.FigureNotFoundException;
import ru.job4j.chess.exception.ImpossibleMoveException;
import ru.job4j.chess.exception.OccupiedWayException;

public class Board {
    private Figure[][] figures = new Figure[8][8];
    private int position = 0;

    private boolean searshLenght() {

        return false;
    }

    /**
     * принимает фигуру и проверяет не занята ли данная клетка другой фигурой после добавляет её
     *
     * @param newFigure
     */
    public void add(Figure newFigure) {
        boolean add = false;
        if (this.figures[newFigure.getBegincoordinat().getX()][newFigure.getBegincoordinat().getY()] != null) {
            System.out.println(newFigure + ", фигуру нельзя поставить на клетку");
        } else {
            this.figures[newFigure.getBegincoordinat().getX()][newFigure.getBegincoordinat().getY()] = newFigure;
        }
    }

    public boolean move(Cell source, Cell dest) throws OccupiedWayException, FigureNotFoundException, ImpossibleMoveException {
        boolean result = true;
        Cell[] way;
        if ((this.figures[source.getX()][source.getY()]) != null) {
            if (this.figures[source.getX()][source.getY()].isCondition(source, dest)) {
                way = this.figures[source.getX()][source.getY()].way(source, dest);
                for (Cell index : way) {
                    if (index != null && this.figures[index.getX()][index.getY()] != null) {
                        throw new OccupiedWayException();
                    }
                }
            } else {
                throw new ImpossibleMoveException();
            }
        } else {
            throw new FigureNotFoundException();
        }
        if (result) {
            this.figures[dest.getX()][dest.getY()] = this.figures[source.getX()][source.getY()].figureCopy(dest);
            this.figures[source.getX()][source.getY()] = null;
        }
        return result;
    }

    public Figure[][] getFigures() {
        return figures;
    }
}