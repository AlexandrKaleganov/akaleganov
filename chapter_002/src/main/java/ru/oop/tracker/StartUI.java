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
    private static final String EXIT = "6";

    StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    StartUI(Tracker tracker, Input input) {
        this.input = input;
        this.tracker = tracker;
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

    public void init() {
        boolean exit = false;
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillAction();
        do {
            menu.shou();
            int key = Integer.valueOf(input.zaprosNavvod("Select:"));
            menu.select(key);
        }        while (tracker.getExitProgramm().equals("6")); // в трекер добавил поле, которое постоянно равно шести, пока его не изменяет метод


//        while (!exit) {
//            shouMenu();
//            String answer = input.zaprosNavvod("Выберете пункт меню");
//            if (answer.equals(ADD)) {
//                this.addITEMS();
//            } else if (answer.equals(SHOW_ALL)) {
//                this.showALL();
//            } else if (answer.equals(EDIT_ITEMS)) {
//                this.editITEMS();
//            } else if (answer.equals(DELETE_ITEMS)) {
//                this.deleteITEMS();
//            } else if (answer.equals(FIND_ID)) {
//                this.findIDITEMS();
//            } else if (answer.equals(FIND_NAME)) {
//                this.findNAMEITEMS();
//            } else if (answer.equals(EXIT)) {
//                exit = true;
//            }
//        }
    }

    /**
     * метод добавления новой заявки
     */
    private void addITEMS() {
        tracker.add(new Items(input.zaprosNavvod("Пожалусто введите имя заявки"), input.zaprosNavvod("Пожалусто введите описание заявки")));



    }

    /**
     * вывод списка всех заявок
     */
    public void showALL() {
        for (Items items:tracker.findAll()) {
            if (items != null) {
               this.output.outthet(new String(items.toString()));
            }
        }
    }

    /**
     * изменение заявки
     */
    public void editITEMS() {
        String id = input.zaprosNavvod("Введите id заявки, которую вы хтите изменить");
        Items items = new Items(input.zaprosNavvod("Введите новое им заявки"), input.zaprosNavvod("Введите новое описание заявки"));
        tracker.replace(id, items);
    }

    /**
     * метод удаления заявки
     */
    public void deleteITEMS() {
        tracker.delete(input.zaprosNavvod("Введите id заявки, которую необходимо удалить"));
    }

    /**
     * метод находит заявку по id
     */
    public void findIDITEMS() {
        this.output.outthet(new String((tracker.findById(input.zaprosNavvod("Введите id заявки, которую необходимо найти"))).toString()));
    }

    /**
     * находит все элементы завки с похожими именами и выводит их
     */
    public void findNAMEITEMS() {
        for (Items item: tracker.findByName(input.zaprosNavvod("Введите имя заявки"))) {
            if (item != null) {
                this.output.outthet(new String(item.toString()));
            }
        }
    }

    /**
     * просто вывод меню
     */
    public void shouMenu() {
        this.output.outthet(new String("0. Add new Item\n" + "1. Show all items\n" + "2. Edit item\n" + "3. Delete item\n" + "4. Find item by Id\n" + "5. Find items by name\n" + "6. Exit Program\n" + "Select:"));
    }
}
