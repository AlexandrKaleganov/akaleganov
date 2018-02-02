package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void testirovanieArrayTurnFOReach() {
        int[] excepted = new int[]{3, 2, 1};
        int[] arr123 = new int[]{1,2,3};

        int[] intarray = new Turn().backArray(arr123);
        assertThat(intarray, is(excepted));
    }
}
