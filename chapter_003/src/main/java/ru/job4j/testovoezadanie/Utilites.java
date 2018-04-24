package ru.job4j.testovoezadanie;
/**
 * класс утилыты содержит два метода сортировки, метод создания временного листа для сравнения, метод рефакторинга справочника
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;

public class Utilites {
    private ArrayList<String> temp = new ArrayList<>();

    /**
     * прямая сортировка
     *
     * @param database
     */
    public void sortedDataStright(Database database) {
        database.getSpravocnik().sort(String::compareTo);
    }

    /**
     * обратная сортировка
     * можено было сделать через reversOrder
     *
     * @param database
     */
    public void sortedDataRewers(Database database) {
        database.getSpravocnik().sort(new Comparator<String>() {
            @Override
            public int compare(String left, String right) {
                int result = 0;
                result = left.compareTo(right);
                if (result == 1) {
                    result = -1;
                } else if (result == -1) {
                    result = 1;
                }
                return result;
            }
        });
    }

    /**
     * в этом методе мы будем проверять нашу базу депортаментов
     * и в случае отсутствия строк верхнего уровня будем добавлять их в базу
     * сделал так: сосдав временный лист, в котором стал хранить все строки нижнего уровня,
     * чтобы потом брать и проверять ими нашь список департаментов
     * PS: жутко понравились лямбла метода фор
     *
     * @param database
     */
    public void refactorDatabase(Database database) {
        addTemplist(database);
        this.temp.forEach(stroka -> {
            for (int i = 6; i >= 2; i -= 4) {
                String deportament = stroka.substring(0, i);
                    if (!database.getSpravocnik().contains(deportament)) {
                        database.addDeportament(deportament);
                    }
            }
        });
        this.temp.clear();
    }

    /**
     * тут мы будем создавать временный лист, в котором будем хранить все строки нижнего уровня
     *
     * @param database
     */
    private void addTemplist(Database database) {
        database.getSpravocnik().forEach(data -> {
            if (data.length() == 11) {
                this.temp.add(data);
            }
        });
    }

}
