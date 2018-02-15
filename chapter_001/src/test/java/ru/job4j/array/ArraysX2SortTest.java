package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class ArraysX2SortTest {

    @Test
    public void testirovanieArraMASSIVtest() {
        int[] array = {1, 4, 5};
        int[] array2 = {2, 3, 6};
        int[] array3 = ArraysX2Sort.ssortirovkaMassivavodin(array, array2);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertThat(array3, is(expected));
    }
}