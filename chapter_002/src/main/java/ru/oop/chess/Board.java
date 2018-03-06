package ru.oop.chess;
import javafx.scene.control.Cell;
public class Board {
    private Figure[] figures = new Figure[32];
    private int position = 0;


    /**
     * принимает фигуру и добавляет её
     * @param figure
     */
    public void add(Figure figure) {
        this.figures[position++] = figure;
    }

    boolean move(Cell source, Cell dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        boolean expected = false;
        return expected;
    }
}
