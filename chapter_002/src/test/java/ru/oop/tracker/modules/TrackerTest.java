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

}