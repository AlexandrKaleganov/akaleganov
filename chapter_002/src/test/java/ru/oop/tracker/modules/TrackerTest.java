package ru.oop.tracker.modules;

import org.junit.Test;
import ru.oop.prof.Teacher;

import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void testirovanieTrackerVSE(){
        Tracker tracker = new Tracker();
        Items items = new Items("Нужна помощь", "Сломалось, ничего не работает, компьютер не запускается" );
        tracker.add(items);
        System.out.println(tracker.findAll()[0]);
    }

}