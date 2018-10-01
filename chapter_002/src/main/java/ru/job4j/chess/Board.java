package ru.job4j.chess;

import ru.job4j.chess.exception.FigureNotFoundException;
import ru.job4j.chess.exception.ImpossibleMoveException;
import ru.job4j.chess.exception.OccupiedWayException;

import java.util.function.*;

public class Board {
    private Figure[] figures = new Figure[32];
    private final int[] index = {0};

    private void lambdaRefactor(Cell cell, BiConsumer<Integer, Boolean> fanc) {
        int rsl = 0;
        boolean isEquals = false;
        for (int i = 0; i < this.figures.length; i++) {
            if (this.figures[i] != null) {
                if (this.figures[i].getBegincoordinat().equals(cell)) {
                    isEquals = true;
                    rsl = i;
                    break;
                }
            } else {
                break;
            }
        }
        fanc.accept(rsl, isEquals);
    }

    /**
     * принимает фигуру и проверяет не занята ли данная клетка другой фигурой после добавляет её
     *
     * @param newFigure
     */
    public void add(Figure newFigure) {

        this.lambdaRefactor(newFigure.getBegincoordinat(), (i, isEquals) -> {
            if (!isEquals) {
                this.figures[this.index[0]++] = newFigure;
            }
        });

    }

    public boolean move(Cell source, Cell dest) throws OccupiedWayException, FigureNotFoundException, ImpossibleMoveException {
        boolean result = true;

        this.lambdaRefactor(source, (i, isEquals) -> {
            if (!isEquals) {
                throw new FigureNotFoundException();
            } else {
                if (!this.figures[i].isCondition(source, dest)) {
                    throw new ImpossibleMoveException();
                } else {
                    Cell[] way = this.figures[i].way(source, dest);
                    for (int j = 0; j < way.length; j++) {
                        if (way[j] != null) {
                            this.lambdaRefactor(way[j], (n, isTest) -> {
                                if (isTest) {
                                    throw new OccupiedWayException();
                                }
                            });
                        }
                    }
                    this.figures[i] = this.figures[i].figureCopy(dest);
                }
            }
        });
        return result;
    }

    public Figure[] getFigures() {
        return figures;
    }
}