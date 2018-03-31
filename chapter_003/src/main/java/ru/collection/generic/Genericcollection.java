package ru.collection.generic;

import java.util.*;
import java.util.function.Consumer;

public class Genericcollection {
    static class Users {
        private final String name;

        Users(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Users users = (Users) o;
            return Objects.equals(name, users.name);
        }

        @Override
        public int hashCode() {

            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Users{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Users> users = new ArrayList<Users>();
        users.addAll(Arrays.asList(new Users("Alex"), new Users("peter")));
        boolean result = users.contains(new Users("Alex"));
        System.out.println(result);
        Iterator<Users> iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(users);
        for (Users user : users) {
            System.out.println(user);
        }
        users.forEach(new Consumer<Users>() {
            @Override
            public void accept(Users user) {
                System.out.println(user);
            }
        });
        users.forEach(user -> System.out.println(user));
    }
}
