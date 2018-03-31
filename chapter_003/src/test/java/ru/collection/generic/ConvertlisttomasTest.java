package ru.collection.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class ConvertlisttomasTest {
    @Test
    public void convertListtest() {
        Convertlisttomas convertList = new Convertlisttomas();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2});
        list.add(new int[]{3, 4, 5, 6});
        List<Integer> result = convertList.convert((ArrayList) list);
        List<Integer> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertThat(expected, is(result));
    }

}