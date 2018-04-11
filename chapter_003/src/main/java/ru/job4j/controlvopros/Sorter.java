package ru.job4j.controlvopros;


import ru.job4j.convertlistinmap.User;

import java.util.*;

public class Sorter {

    public Sorter() { // пробела не хватает

    }

    Set<User> sort(List<User> list) {  //лишний пробел после названия метода
        TreeSet<User> sortedList = new TreeSet<>();
        sortedList.addAll(list);
        return sortedList;
    }

    List<User> sortnamelength(List<User> list) { //пробел после имени метода
        Comparator<User> compar = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) { //пробел после имени метода
                //return o1.getName().length() - o2.getName().length(); зачем мы отнимаем длинну имени одного юзера от другого?
                return Integer.compare(o1.getName().length(), o2.getName().length()); //сделал бы так
            }
        };
        list.sort(compar);
        return list;
    }
    /**
     * поменял бы название метода sortnameandAge
     */
    List<User> sortnameandAge(List<User> list) {                //после названия метода пробел аж в глаза бросается его я убрал
        Comparator<User> compar1 = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {            //после названия метода пробел
                if (o1.getName().compareTo(o2.getName()) == 0) { //пробел перед скобкой
                    return o1.getAge().compareTo(o2.getAge());
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        };
        /**
         * зачем создавать лишний объект?
         */
//        Comparator<User> compar2 = new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {             //после названия метода пробел
//                //  return o1.getAge() - o2.getAge();  тоже не понятно для чего мы возраст одного отнимаем от другого
//                return Integer.compare(o1.getAge(), o2.getAge());
//            }
//        };
        list.sort(compar1);
        return list;
    }
}