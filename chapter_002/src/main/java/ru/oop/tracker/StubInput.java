package ru.oop.tracker;

public class StubInput implements Input {
private String[] answers;
private int position = 0;
public StubInput(String[] answer) {
    this.answers = answer;
}
    @Override
    public String zaprosNavvod(String schprech) {
        return answers[position++];
    }
}
