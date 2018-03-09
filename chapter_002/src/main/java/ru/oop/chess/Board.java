package ru.oop.chess;
import ru.oop.chess.allfigur.*;
import ru.oop.chess.exception.FigureNotFoundException;
import ru.oop.chess.exception.ImpossibleMoveException;
import ru.oop.chess.exception.OccupiedWayException;

public class Board {
    private Figure[] figures = new Figure[32];
    private int position = 0;

    /**
     * принимает фигуру и проверяет не занята ли данная клетка другой фигурой после добавляет её
     *
     * @param newFigure
     */
    public void add(Figure newFigure) {
        for (int i = 0; i < figures.length; i++) {
            if (newFigure.equals(figures[i])) {
                System.out.println("извините, данная клетка " + figures[i] + "занята другой  фигурой " + figures[i].getClass()  + ", фигуру нельзя поставить на клетку");
                break;
            } else {
                this.figures[position++] = newFigure;
                break;
            }
        }
    }

    public boolean move(Cell source, Cell dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        Figure value;
        Cell[] cellWAY = new Cell[8];
        int index = 0;           //запомним нужный  индекс элемента чтобы не бегать по массиву
        boolean expected = false;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].hashCode() == source.hashCode()){
                index = i;
                expected = true;

                cellWAY = figures[i].w;
                value = figures[i];
                System.out.println(cellWAY[7].hashCode());
                break;
            } else {
                throw new ImpossibleMoveException();
            }
        }
        if (expected) {
        for (int i = 0; i < figures.length ; i++) {
            for (int j = 1; j < cellWAY.length; j++) { //начём со второго элемента, т.к. первый координаты первоо элемента присутствуют в нашем массиве
                if (figures[i].hashCode() != cellWAY[j].hashCode()){
                    expected = true;
                    figures[index] =  figures[index].;
                } else {
                    expected = false;
                    throw new OccupiedWayException();
                }
            }
        }

        }
                return expected;
    }

    public Figure[] getFigures() {
        return figures;
    }
}