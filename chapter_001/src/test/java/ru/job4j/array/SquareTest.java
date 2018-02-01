package ru.job4j.array;

import org.junit.Test;

import static java.lang.Math.pow;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void testirovanieArraySquareFORi(){
        int[] excepted = new int[]{1,4,9};
        Square [] intarray = null;
        int []pro = null;
pro = intarray.calculate(3) ;
assertThat(pro, is(excepted));

 }
}
