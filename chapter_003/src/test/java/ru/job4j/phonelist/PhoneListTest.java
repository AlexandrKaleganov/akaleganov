package ru.job4j.phonelist;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneListTest {
    @Test
    public void whenFindByName() {
        PhoneList phones = new PhoneList();
        phones.addAbonent(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        List<Person> persons = phones.search("Petr");
        assertThat(persons.iterator().next().getSurname(), is("Arsentev"));
        StringBuilder stringBuilder = new StringBuilder();
        Stream.of(1, 2, 3, 4, 5, 6)
                .map(Object::toString)
                .forEach(stringBuilder::append);
        System.out.println(stringBuilder.toString());
    }
}
