package ru.oop.prof.dopclass;
/**
 * проверьте мою эту дурость обязательно я час потратил,
 * зациклило на создании класса правильно ли я этот момент продумал
 * тест класса Sex т.е. пол
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class SexTest {

    @Test
    public void testirovanieArrayDuplicateTEST() {
        Sex sex = new Sex(1);
      String sex1 = sex.opredeleniePollaPOznacheniu(1);
        String expected = "М";
        assertThat(sex1, is(expected));
    }
}
