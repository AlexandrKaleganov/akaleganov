package ru.job4j.chess;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LadiaTest {
    @Test
    public void ladiaReturnwayValid() {
        Board board = new Board();
        Ladia ladia = new Ladia(new Cell(2, 2));
        board.add(ladia);
        assertThat(true, is(board.move(new Cell(2, 2), new Cell(2, 5))));
    }

}