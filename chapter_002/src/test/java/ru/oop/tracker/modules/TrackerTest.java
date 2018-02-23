package ru.oop.tracker.modules;

import org.junit.Test;
import ru.oop.prof.Teacher;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void testirovanieTrackerADD() { //проверка метода add
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается");
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        tracker.add(items);
        tracker.add(items1);
        Items expected = tracker.getItemsIndex(0);
        assertThat(expected, is(items));
    }

    @Test
    public void testirovanieTrackerReplace() { //проверка метода изменения заявки
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается");
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        tracker.add(items);
        tracker.add(items1);
        Tracker tracker1 = new Tracker();
        Items items3 = new Items("Я твой дом труба шатал", "слышь админ я тебя найду сцуко!!!");
        Items items4 = new Items("Цой жив))", "Кипелов тру)");
        tracker1.add(items3);
        tracker1.add(items4);
        System.out.println(tracker1.getItemsIndex(1));
        tracker1.replace(items3.getId(), items);
        System.out.println(tracker1.getItemsIndex(1));
        assertThat(tracker.getItemsIndex(0), is(tracker1.getItemsIndex(0)));
    }

    @Test
    public void testirovanieTrackerdelete() { //проверка метода удаления заявки
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается");
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        Items expected = null;
        tracker.add(items);
        tracker.add(items1);
        tracker.delete(tracker.getItemsIndex(1).getId());
        assertThat(tracker.getItemsIndex(1), is(expected));
    }

    @Test
    public void testirovanieTrackerfindAll() { //проверка метода показать все заявки
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается");
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        tracker.add(items);
        tracker.add(items1);
        Tracker tracker1 = new Tracker();
        Items[] ekepted = tracker.findAll();
        for (Items i:ekepted) {
            if (i != null) {
                tracker1.add(i);
            } else {
                break;
            }
        }
        assertThat(tracker.findAll(), is(tracker1.findAll()));
    }

    @Test
    public void testirovanieTrackerById() {   // поверка метода поиск заявки по id
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается");
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        tracker.add(items);
        tracker.add(items1);
        Items res = tracker.findById(items1.getId());
        assertThat(res, is(tracker.getItemsIndex(1)));
    }

    @Test
    public void testirovanieTrackerByName() { // проверка метода поиска заявок  по имени(похожие заявки)
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается");
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        tracker.add(items);
        tracker.add(items1);
        Items expected = items;
        Items[] result = tracker.findByName("Нужна");
        assertThat(result[0], is(expected));
    }
}