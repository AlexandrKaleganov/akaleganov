package ru.oop.strategy;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void testirovanieSQUAREpaint() {

        assertThat(new Square().draw(), is(new StringBuilder()
                        .append("####")
                        .append("####")
                        .append("####")
                        .append("####")
                        .toString()
                )
        );
    }
}