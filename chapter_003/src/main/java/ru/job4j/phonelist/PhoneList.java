package ru.job4j.phonelist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * этот класс будет осуществлть работу телефонного справочника
 */
public class PhoneList {
    private ArrayList<Person> spravochnik = new ArrayList<>();

    public void addAbonent(Person person) {
        this.spravochnik.add(person);
    }

    public List<Person> search(String key) {
        return spravochnik.stream().filter(i-> key.contains(i.getAdres()) || key.contains(i.getName()) || key.contains(i.getPhone()) || key.contains(i.getSurname())

        ).collect(Collectors.toList());
    }
}
