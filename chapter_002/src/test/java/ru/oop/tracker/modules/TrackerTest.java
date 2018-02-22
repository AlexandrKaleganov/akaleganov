package ru.oop.tracker.modules;

import org.junit.Test;
import ru.oop.prof.Teacher;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void testirovanieTrackerADD(){
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается" );
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        tracker.add(items);
        tracker.add(items1);
        Items expected = tracker.getItemsIndex(0);
        assertThat(expected, is(items));
    }
    @Test
    public void testirovanieTrackerReplace(){
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается" );
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        tracker.add(items);
        tracker.add(items1);
        Tracker tracker1 = new Tracker();
        Items items3 = new Items("Я твой дом труба шатал", "слышь админ я тебя найду сцуко!!!" );
        Items items4 = new Items("Цой жив))", "Кипелов тру)");
        tracker1.add(items3);
        tracker1.add(items4);
        System.out.println(tracker1.getItemsIndex(1));
        tracker1.replace(items4.getId(), items);
        System.out.println(tracker1.getItemsIndex(1));
        assertThat(tracker.getItemsIndex(0).getDesc(), is(tracker1.getItemsIndex(1).getDesc()));
    }
    @Test
    public void testirovanieTrackerdelete(){
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается" );
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        Items expected = null;
        tracker.add(items);
        tracker.add(items1);
        tracker.delete(tracker.getItemsIndex(1).getId());
        assertThat(tracker.getItemsIndex(1), is(expected));
    }
    @Test
    public void testirovanieTrackerfindAll(){
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается" );
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        tracker.add(items);
        tracker.add(items1);
        Tracker tracker1 = null;
        Items[] ekepted  = tracker.findAll();
        assertThat(tracker, is(tracker.findAll()));
    }

    @Test
    public void testirovanieTrackerById(){
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается" );
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        tracker.add(items);
        tracker.add(items1);
        Items res = tracker.findById(items1.getId());
        assertThat(res, is(tracker.getItemsIndex(1)));
    }

}