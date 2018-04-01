package ru.oop.tracker;

import ru.oop.tracker.modules.Items;
import ru.oop.tracker.modules.Tracker;

public class StartUI {
    private final Tracker tracker;
    private final Input input;
    private final Output output = new OutConsole();


    private static final String ADD = "0";
    private static final String SHOW_ALL = "1";
    private static final String EDIT_ITEMS = "2";
    private static final String DELETE_ITEMS = "3";
    private static final String FIND_ID = "4";
    private static final String FIND_NAME = "5";
    private static final String ADD_COMMENT = "6";
    private static final String EXIT = "7";

    StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    StartUI(Tracker tracker, Input input) {
        this.input = input;
        this.tracker = tracker;
    }

    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }

    public void init() {
        boolean exit = false;
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillAction();
         int[] range = menu.returnFINALmenu();

        do {
            menu.shou();
            menu.select(input.inputCommand("Select:", range));
        } while (tracker.getExitProgramm()); // в трекер добавил поле, boolean, пока его не изменяет метод
    }

    /**
     * метод добавления новой заявки
     */
    private void addITEMS() {
        tracker.add(new Items(input.inputCommand("Пожалусто введите имя заявки"), input.inputCommand("Пожалусто введите описание заявки")));
    }

    /**
     * вывод списка всех заявок
     */
    public void showALL() {
        for (Items items:tracker.findAll()) {
            if (items != null) {
               this.output.outthet(items.toString());
            }
        }
    }

    /**
     * изменение заявки
     */
    public void editITEMS() {
        String id = input.inputCommand("Введите id заявки, которую вы хтите изменить");
        Items items = new Items(input.inputCommand("Введите новое им заявки"), input.inputCommand("Введите новое описание заявки"));
        tracker.replace(id, items);
    }

    /**
     * метод удаления заявки
     */
    public void deleteITEMS() {
        tracker.delete(input.inputCommand("Введите id заявки, которую необходимо удалить"));
    }

    /**
     * метод находит заявку по id
     */
    public void findIDITEMS() {
        this.output.outthet((tracker.findById(input.inputCommand("Введите id заявки, которую необходимо найти"))).toString());
    }

    /**
     * находит все элементы завки с похожими именами и выводит их
     */
    public void findNAMEITEMS() {
        for (Items item: tracker.findByName(input.inputCommand("Введите имя заявки"))) {
            if (item != null) {
                this.output.outthet(item.toString());
            }
        }
    }

    /**
     * просто вывод меню
     */
    public void shouMenu() {
        this.output.outthet(new String("0. Add new Item\n" + "1. Show all items\n" + "2. Edit item\n" + "3. Delete item\n" + "4. Find item by Id\n" + "5. Find items by name\n" + "7. Exit Program\n" + "7. Exit Program\n" + "Select:"));
    }
}
