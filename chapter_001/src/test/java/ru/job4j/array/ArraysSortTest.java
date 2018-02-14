package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArraysSortTest {
    @Test
    public void arrBubbleSortTEST() {
        int[] arr1 = new int[]{1, 2, 3};
        int[] expected = new int[]{4, 5, 6};
        int[] result = new ArraysSort().ArraysSortDva(arr1, expected);
        int[] prover = new int[]{2,4,5,6,8,11};
        assertThat(result, is(prover));
    }
}
