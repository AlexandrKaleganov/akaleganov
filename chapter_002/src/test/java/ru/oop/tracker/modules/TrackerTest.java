package ru.oop.tracker.modules;

import org.junit.Test;
import ru.oop.prof.Teacher;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void testirovanieTrackerVSE(){
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается" );
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        tracker.add(items);
        Items expected = tracker.getItemsIndex(0);
        assertThat(expected.getName(), is(items.getName()
        ));
    }
    @Test
    public void testirovanieTrackerReplace(){
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Ничего не работает, компьютер не запускается" );
        Items items1 = new Items("Хелп", "От поддержки никакого толка");
        tracker.add(items);
        tracker.add(items1);
        System.out.println(tracker.prtintItems(items));
        System.out.println(tracker.prtintItems(items1));
        tracker.replace(items1.getId(), items);
        System.out.println(tracker.prtintItems(items));
        System.out.println(tracker.prtintItems(items1));


    }

}