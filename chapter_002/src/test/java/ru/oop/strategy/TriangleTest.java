package ru.oop.strategy;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void testirovanieTRIANGLEpaint() {

        assertThat(new Triangle().draw(), is(new StringBuilder()
                .append("  #  ")
                .append(" ### ")
                .append("#####")
                        .toString()
        )
        );
    }

}