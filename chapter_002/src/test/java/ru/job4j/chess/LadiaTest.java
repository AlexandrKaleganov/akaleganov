package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.exception.ImpossibleMoveException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LadiaTest {
    @Test
    public void ladiaReturnwayValid() {
        Board board = new Board();
        Ladia ladia = new Ladia(new Cell(2, 2));
        board.add(ladia);
        for (Cell cell : ladia.way(new Cell(2, 2), new Cell(2, 7))
                ) {
            System.out.println(cell);

        }
        assertThat(true, is(board.move(new Cell(2, 2), new Cell(2, 7))));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void ladiaReturnwaynonValid() {
        Board board = new Board();
        Ladia ladia = new Ladia(new Cell(2, 2));
        board.add(ladia);
        assertThat(true, is(board.move(new Cell(2, 2), new Cell(3, 5))));
    }
}