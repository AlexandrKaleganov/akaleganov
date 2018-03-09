package ru.oop.chess;
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
        Slon slon = new Slon(new Cell(2, 2));
        Cell[] wayslon = slon.way(new Cell(2, 2), new Cell(8, 8));
        assertThat(wayslon[7].hashCode(), is(new Cell(8, 8).hashCode()));
    }

    @Test
    public void slonReturnwayNoValid() {
        Cell[] wayslon = new Slon().way(new Cell(1, 2), new Cell(8, 8));
    }
}