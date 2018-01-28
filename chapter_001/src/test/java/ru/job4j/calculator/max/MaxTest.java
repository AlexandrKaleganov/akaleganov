package ru.job4j.calculator.max;

/**
 * @autor Alexander Kaleganov
 * @version MAxTest 1.000
 * @since 28.01.2018 21:19
 */

import org.junit.Test;
import ru.job4j.max.Max;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstLessSeconds() {
        Max maximum = new Max();
        int result = maximum.max(1, 2);
        assertThat(result, is(2));
    }
}
