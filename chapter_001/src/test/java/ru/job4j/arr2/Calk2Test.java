package ru.job4j.arr2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class Calk2Test {
    @Test
    public void cal2ProverkPRIMERA() {
        double expected = 4;
        double test = Calk2.kkkalCullator("2+2");
        assertThat(test, is(expected));
    }
}
