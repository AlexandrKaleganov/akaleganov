package ru.oop.tracker;
/**
 * Alexandr Kaleganov
 */

import ru.oop.tracker.Output;

public class OutConsole implements Output {
    @Override
    public void outthet(String out) {
        System.out.println(out);
      }
}
