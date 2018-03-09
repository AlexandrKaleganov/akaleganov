package ru.oop.chess.allfigur;
/**
 * тестирование класса слон
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.oop.chess.Cell;
import ru.oop.chess.exception.ImpossibleMoveException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class SlonTest {
    //ссылка на дефолтный вывод в консоль
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();


    @Before
    public void loadOutput()  {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }
    /**
     * тестирование метода way правильный ход
     */
    @Test
    public void slonReturnwayValid() {
        Slon slon = new Slon(new Cell(2,2));
        Cell[] wayslon = slon.way(new Cell(2,2), new Cell(8,8));
        assertThat(wayslon[7].hashCode(), is(new Cell(8,8).hashCode()));
    }

    @Test
    public void slonReturnwayNoValid() {
        Cell[] wayslon = new Slon().way(new Cell(1,2), new Cell(8,8));
        assertThat(this.out.toString(), is(String.format("Фигура туда пойти не может")));
    }

}