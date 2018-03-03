package ru.oop.tracker;

import ru.oop.tracker.modules.Tracker;

public interface UserAction {
   int key();
   void execute(Input input, Tracker tracker);
   String info();
}
