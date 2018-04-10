package ru.job4j.convertlistinmap;

import java.util.Objects;
import java.util.Random;

/**
 * унаследовали интерфейс компарабл и реализовали его в этом классе
 */
public class User implements Comparable<User> {
    private static Random rn = new Random();
    private Integer id;
    private String name;
    private Integer age;
    private String city;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", city='" + city + '\'' + '}' + "\n";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(age, user.age) && Objects.equals(city, user.city);
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, age, city);
    }

    public Integer getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    User(String name, int age, String city) {
        this.name = name;
        this.city = city;
        this.id = generateId();
        this.age = age;
    }

    private static Integer generateId() {
        Integer res = rn.nextInt(200) + 1 + rn.nextInt(100) + 1;
        return res;

    }


    @Override
    public int compareTo(User o) {
        return this.age.compareTo(o.age);
    }
}
