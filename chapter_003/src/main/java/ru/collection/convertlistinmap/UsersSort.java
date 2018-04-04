package ru.collection.convertlistinmap;
/**
 * класс содержит метод который будет сортировать  людей по возрасту в порядке возростания
 */

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UsersSort {

    /**
     * будем принимать лист ,  добавляем в трисет  коллекцию и возвращаем
     * @param list
     * @return
     */
    public Set<User> sort(List<User> list) {

        TreeSet<User> returnUsers = new TreeSet<>();
        returnUsers.addAll(list);
        return returnUsers;
    }
}
