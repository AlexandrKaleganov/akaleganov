package ru.oop.tracker;

public class StubInput implements Input {
private final String[] value;
private int position = 0;

public StubInput(final String[] value) {
    this.value = value;
}
    @Override
    public String zaprosNavvod(String schprech) {
        return this.value[position++];
    }
}
