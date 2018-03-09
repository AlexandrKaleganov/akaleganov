package ru.oop.chess;

import org.junit.Test;
import ru.oop.chess.exception.ImpossibleMoveException;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class BoardTest {

    @Test
    public void testSlonadd() throws ImpossibleMoveException {
        Board board = new Board();
        Slon slon = new Slon(new Cell(1, 1));
        Slon slon2 = new Slon(new Cell(1, 1));
        Slon slon3 = new Slon(new Cell(2, 2));
        board.add(slon);
        board.add(slon2);
        board.add(slon3);
        board.move(new Cell(2, 2), new Cell(8, 8));
        assertThat(board.getFigures()[1].hashCode(), is(new Cell(8, 8).hashCode()));
    }

}