package ru.job4j.iterator;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class IteratrormatrixmassTest {

    @Test
    public void whenhasNextTestIterator() {

        Iteratrormatrixmass iteratrormatrixmass = new Iteratrormatrixmass(new int[][]{{1, 2}, {3}});

        iteratrormatrixmass.next();
        iteratrormatrixmass.next();
        iteratrormatrixmass.next();
        boolean result = iteratrormatrixmass.hasNext();

        assertThat(result, Is.is(false));

    }

    @Test
    public void whennextTestIterator() {
        Iteratrormatrixmass iteratrormatrixmass = new Iteratrormatrixmass(new int[][]{{1, 2}, {3, 4}});

        iteratrormatrixmass.next();
        iteratrormatrixmass.next();
        iteratrormatrixmass.next();
        int result = (Integer) iteratrormatrixmass.next();

        assertThat(result, Is.is(4));
    }
}