package ru.job4j.chess;

import com.sun.org.apache.xpath.internal.functions.FuncBoolean;
import ru.job4j.chess.exception.FigureNotFoundException;
import ru.job4j.chess.exception.ImpossibleMoveException;
import ru.job4j.chess.exception.OccupiedWayException;

public class Board {
    private Figure[] figures = new Figure[32];
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
        boolean add = true;
        int temp = 0;
        for (int i = 0; i < this.figures.length; i++) {
            if (this.figures[i] != null) {
                if (this.figures[i].equals(newFigure)) {
                    add = false;
                }
            } else {
                temp = i;
            }
        }
        if (!add) {
            System.out.println(newFigure + ", фигуру нельзя поставить на клетку");

        } else {
            this.figures[temp] = newFigure;
        }
    }

    public boolean move(Cell source, Cell dest) throws OccupiedWayException, FigureNotFoundException, ImpossibleMoveException {
        boolean result = true;
        Figure temp = null;
        boolean start = true;
        Cell[] way;
        for (int i = 0; i < this.figures.length; i++) {
            if ((this.figures[i] != null) &&
                    (this.figures[i].getBegincoordinat().getX() == source.getX() &&
                            this.figures[i].getBegincoordinat().getY() == source.getY())) {
                start = false;
                temp = this.figures[i];
                break;
            }
        }
        if (!start) {
            if (!temp.isCondition(source, dest)) {
                throw new ImpossibleMoveException();
            }
        } else {
            way = temp.way(source, dest);
            for (int i = 0; i < way.length; i++) {
                for (int j = 0; j < this.figures.length; j++) {
                    if (way[i].hashCode() == this.figures[j].hashCode()) {
                        throw new OccupiedWayException();
                    }
                }
            }
        }
        return result;
    }

    public Figure[] getFigures() {
        return figures;
    }
}