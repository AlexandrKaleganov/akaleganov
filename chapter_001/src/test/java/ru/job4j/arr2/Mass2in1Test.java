package ru.job4j.arr2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class Mass2in1Test {

    @Test
    public void testirovanieArraMASSIVtest() {
        int[] array = {1, 4, 5};
        int[] array2 = {2, 200, 6300};
        int[] array3 = Mass2in1.ssortirovkaMassivavodin(array, array2);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertThat(array3, is(expected));
    }
}