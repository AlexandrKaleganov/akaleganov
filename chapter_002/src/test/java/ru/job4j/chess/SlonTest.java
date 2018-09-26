package ru.job4j.chess;
/**
 * тестирование класса слон
 */

import org.junit.Test;

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
        assertThat(true, is(board.move(new Cell(2, 2), new Cell(5, 5))));
    }
}