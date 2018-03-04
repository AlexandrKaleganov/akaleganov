package ru.oop.tracker;

public class ValidateInput extends ConsoleInput {

    @Override
    public int inputCommand(String command, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
               value = super.inputCommand(command, range);
               invalid = false;
            } catch (MenuOutException tes) {
                System.out.println("Пожалусто выберете ключ меню");
            } catch (NumberFormatException nfe) {
                System.out.println("Ошибка, введите корректные данные");
            }
        } while (invalid);
        return  value;
    }
}
