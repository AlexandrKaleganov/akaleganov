package ru.oop.tracker;

public class StubInput implements Input {
    private final String[] value;
    private int position = 0;

    public StubInput(final String[] value) {
        this.value = value;
    }
    @Override
    public String inputCommand(String command) {
        return this.value[position++];
    }

    @Override
    public int inputCommand(String command, int[] range) {
       // throw  new UnsupportedOperationException("не понял зачем мы его написали");
        return -1;
    }
}
