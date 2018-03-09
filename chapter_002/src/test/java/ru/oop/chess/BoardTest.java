package ru.oop.chess;

import org.junit.Test;
import ru.oop.chess.allfigur.Ladia;
import ru.oop.chess.allfigur.Slon;
import ru.oop.chess.exception.ImpossibleMoveException;
import ru.oop.chess.exception.OccupiedWayException;
import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.is;

public class BoardTest {
    @Test
    public void testSlonadd() throws ImpossibleMoveException {
        Cell cell = new Cell(1, 5);
        Board board = new Board();
        Slon slon = new Slon(new Cell(1, 1));
        Ladia ladia = new Ladia(new Cell(1, 1));
        Ladia ladia2 = new Ladia(new Cell(2, 1));
        board.add(slon);
        Cell test1 = new Cell(1, 1);
        Cell test = new Cell(1, 1);
        if (test1.equals(test)) {
            System.out.println("проверка селл");
            System.out.println(test.hashCode());
        }
        if (board.getFigures()[0].hashCode() == test.hashCode()) {
            System.out.println("заработало");
        }
        Cell[] res = new Cell[8];
        res = slon.way(new Cell(2, 2), new Cell(8,8));
        System.out.println(board.getFigures()[0].getClass());
        assertThat(board.getFigures()[0], is(ladia));
    }

}