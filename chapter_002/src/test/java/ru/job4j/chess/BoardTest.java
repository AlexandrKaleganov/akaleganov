package ru.job4j.chess;

import org.junit.Test;

import ru.job4j.chess.exception.FigureNotFoundException;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class BoardTest {

    @Test(expected = FigureNotFoundException.class)
    public void testLadiaddmove() {
        Board board = new Board();

        board.move(new Cell(5, 5), new Cell(5, 8));
        assertThat(board.getFigures()[2].hashCode(), is(new Cell(5, 8).hashCode()));
    }

}