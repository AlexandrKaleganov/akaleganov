package ru.job4j.chess;
/**
 * тестирование класса слон
 */

import org.junit.Test;
import ru.job4j.chess.exception.FigureNotFoundException;
import ru.job4j.chess.exception.ImpossibleMoveException;
import ru.job4j.chess.exception.OccupiedWayException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SlonTest {

    /**
     * тестирование метода way правильный ход
     */
    @Test
    public void slonReturnwayValid() {
        Board board = new Board();
        Slon slon = new Slon(new Cell(2, 2));
        board.add(slon);
        assertThat(board.getFigures()[0].hashCode(), is(22));
        assertThat(true, is(board.move(new Cell(2, 2), new Cell(5, 5))));
        assertThat(board.getFigures()[0].hashCode(), is(55));

    }

    @Test(expected = ImpossibleMoveException.class)
    public void slonReturnwaynonValid() {
        Board board = new Board();
        Slon slon = new Slon(new Cell(2, 2));
        board.add(slon);
        assertThat(true, is(board.move(new Cell(2, 2), new Cell(4, 5))));
    }

    @Test(expected = OccupiedWayException.class)
    public void slonReturnwaynonValidTwo() {
        Board board = new Board();
        Slon slon = new Slon(new Cell(2, 2));
        Slon slon1 = new Slon(new Cell(3, 3));
        board.add(slon1);
        board.add(slon);
        assertThat(true, is(board.move(new Cell(2, 2), new Cell(5, 5))));
    }

    @Test(expected = FigureNotFoundException.class)
    public void slonReturnwaynonValidFree() {
        Board board = new Board();
        Slon slon = new Slon(new Cell(2, 2));
        board.add(slon);
        assertThat(true, is(board.move(new Cell(3, 3), new Cell(5, 5))));
    }

}