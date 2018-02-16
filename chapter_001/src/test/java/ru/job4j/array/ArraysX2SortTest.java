package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class ArraysX2SortTest {
    @Test
    public void testirovanieArraMASSIVtest() {
        int[] array = {1, 2, 3, 4, 50};
        int[] array2 = {3, 6, 8, 10, 11, 12, 13, 14};
        int[] array3 = ArraysX2Sort.ssortirovkaMassivavodin(array, array2);
        int[] expected = {1, 2, 3, 3, 4, 6, 8, 10, 12};
        assertThat(array3, is(expected));
    }
}