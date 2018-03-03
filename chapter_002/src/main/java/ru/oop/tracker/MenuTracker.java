package ru.oop.tracker;

import ru.oop.tracker.modules.Items;
import ru.oop.tracker.modules.Tracker;

/**
 * внешний класс
 */
class EditItemsclass implements UserAction {
    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.zaprosNavvod("Введите id заявки, которую вы хтите изменить");
        Items items = new Items(input.zaprosNavvod("Введите новое им заявки"), input.zaprosNavvod("Введите новое описание заявки"));
        tracker.replace(id, items);
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Edit item");
    }
}

/**
 * основной класс
 */
public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[10];
    private Output output = new OutConsole();
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    public void fillAction() {
        this.actions[0] = new AddItem();
        this.actions[1] = new MenuTracker.ShouALLitems();
        this.actions[2] = new EditItemsclass();
        this.actions[3] = new MenuTracker.Deleteitems();
        this.actions[4] = new MenuTracker.FindByaItemsId(); // зачем мы так написали? у нас итак всё будет работать если мы напишем new FindByaItemsId();
        this.actions[5] = new Finditemsbyname();
        this.actions[6] = new Exitprogramm();
    }
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }
    public void shou() {
        for (UserAction action:this.actions) {
            if (action != null) {
                output.outthet(new String(action.info().toString()));
            }
        }
    }


    /**
     * внутренние не статичные классы
     */
    private class AddItem implements UserAction {

        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            tracker.add(new Items(input.zaprosNavvod("Пожалусто введите имя заявки"), input.zaprosNavvod("Пожалусто введите описание заявки")));

        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Add new Item");
        }
    }
    private class Finditemsbyname implements UserAction {
        private Output output = new OutConsole();

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (Items item: tracker.findByName(input.zaprosNavvod("Введите имя заявки"))) {
                if (item != null) {
                    this.output.outthet(new String(item.toString()));
                }
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find items by name");
        }
    }

    private class Exitprogramm implements UserAction {
        private Output output = new OutConsole();

        @Override
        public int key() {
            return 6;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
         tracker.setExitPrograpp("Exit");
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Exit Program");
        }
    }
    /**
     * внутренние статичные классы
     */
    private static class ShouALLitems implements UserAction {
        private Output output = new OutConsole();

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (Items items:tracker.findAll()) {
                if (items != null) {
                    this.output.outthet(new String(items.toString()));
                }
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }
    }
    private static class Deleteitems implements UserAction {
        private Output output = new OutConsole();

        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            tracker.delete(input.zaprosNavvod("Введите id заявки, которую необходимо удалить"));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item");
        }
    }
    private static class FindByaItemsId implements UserAction {
        private Output output = new OutConsole();

        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            this.output.outthet(new String((tracker.findById(input.zaprosNavvod("Введите id заявки, которую необходимо найти"))).toString()));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by Id");
        }
    }
    private static class Select implements UserAction {
        private Output output = new OutConsole();

        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            this.output.outthet(new String((tracker.findById(input.zaprosNavvod("Введите id заявки, которую необходимо найти"))).toString()));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by Id");
        }
    }
}

