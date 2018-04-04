package ru.collection.convertlistinmap;

import org.hamcrest.core.Is;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class UsersSortTest {

    @Test
    public void whenSortthenUsersort() {
        User user1 = new User("Григорич", 34, "VengerovoCity");
        User user2 = new User("Саша", 30, "ChanyCity");
        List<User> listUser = new ArrayList<>();
        listUser.addAll(Arrays.asList(user1, user2));
        System.out.println(listUser);
        Set<User> expected = new TreeSet<>(Arrays.asList(user2, user1));
        Set<User> result = new UsersSort().sort(listUser);
        System.out.println(result);
        assertThat(expected, Is.is(result));
    }
}