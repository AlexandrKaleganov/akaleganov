package ru.oop.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.oop.tracker.modules.Tracker;
import ru.oop.tracker.modules.Items;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * конструктор StartUI переделал чтобы первым делом входило значение
 * возвращаемого трекера со списком заявок, а потом Input типо что будем с ними делать чтобы зарефакторить
 */

public class StubInputTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final Items in1 = new Items("his", "desc");
    private final Items in2 = new Items("name", "desc2");

    @Before
    public void loadOutput()  {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    /**
     * возвращает готовый список заявок
     * @return
     */
    public Tracker trackerReturn() {
        Tracker tracker = new Tracker();
        tracker.add(this.in1);
        tracker.add(this.in2);
        return tracker;
    }

    public Input inputReturn(String[] str) {
        Input input = new StubInput(str);
        return input;
    }

    /**
     * тест добавления заявки
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker1 = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker1).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker1.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     * тестирование вывода списка всех заявок
     */
    @Test
    public void whenshouAllTrackshouall() {
        new StartUI(inputReturn(new String[]{"1", "6"}), trackerReturn()).init();
        assertThat(new String(this.out.toByteArray()), is(
                new StringBuilder()
                        .append(
                                "0. Add new Item\n" +
                                        "1. Show all items\n" +
                                        "2. Edit item\n" +
                                        "3. Delete item\n" +
                                        "4. Find item by Id\n" +
                                        "5. Find items by name\n" +
                                        "6. Exit Program\n" +
                                        "Select:")
                        .append(System.lineSeparator())
                        .append(this.in1)
                        .append(System.lineSeparator())
                        .append(this.in2)
                        .append(System.lineSeparator())
                        .append(
                                "0. Add new Item\n" +
                                        "1. Show all items\n" +
                                        "2. Edit item\n" +
                                        "3. Delete item\n" +
                                        "4. Find item by Id\n" +
                                        "5. Find items by name\n" +
                                        "6. Exit Program\n" +
                                        "Select:")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }

    /**
     * тестирование вывода в консоль заявки по id
     */
    @Test
    public void whenFindbyIDitems() {
        new  StartUI(trackerReturn(), inputReturn(new String[]{"4", trackerReturn().findAll()[1].getId(), "6"})).init();
        assertThat(new String(this.out.toByteArray()), is(new StringBuilder()
                        .append(
                                "0. Add new Item\n" +
                                        "1. Show all items\n" +
                                        "2. Edit item\n" +
                                        "3. Delete item\n" +
                                        "4. Find item by Id\n" +
                                        "5. Find items by name\n" +
                                        "6. Exit Program\n" +
                                        "Select:")
                        .append(System.lineSeparator())
                        .append(this.in2)
                        .append(System.lineSeparator())
                        .append(
                                "0. Add new Item\n" +
                                        "1. Show all items\n" +
                                        "2. Edit item\n" +
                                        "3. Delete item\n" +
                                        "4. Find item by Id\n" +
                                        "5. Find items by name\n" +
                                        "6. Exit Program\n" +
                                        "Select:")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }
    /**
     * тестирование вывода в консоль заявк по имени
     */
    @Test
    public void whenFindbyNAMEitems() {
        new StartUI(trackerReturn(), inputReturn(new String[]{"5", in2.getName(), "6"})).init();
        assertThat(new String(this.out.toByteArray()), is(new StringBuilder()
                        .append(
                                "0. Add new Item\n" +
                                        "1. Show all items\n" +
                                        "2. Edit item\n" +
                                        "3. Delete item\n" +
                                        "4. Find item by Id\n" +
                                        "5. Find items by name\n" +
                                        "6. Exit Program\n" +
                                        "Select:")
                        .append(System.lineSeparator())
                        .append(this.in2)
                        .append(System.lineSeparator())
                        .append(
                                "0. Add new Item\n" +
                                        "1. Show all items\n" +
                                        "2. Edit item\n" +
                                        "3. Delete item\n" +
                                        "4. Find item by Id\n" +
                                        "5. Find items by name\n" +
                                        "6. Exit Program\n" +
                                        "Select:")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }

    /**
     * тест изменения заявки по id
     */
    @Test
    public void whenShouEditThenTrackerHashEdi() {
        Tracker treck = new Tracker();
        Items items = new Items("name", "desc");
        treck.add(items);
        Input input = new StubInput(new String[]{"2", items.getId(), "test name", "desc new", "6"});
        new StartUI(input, treck).init();
        assertThat(treck.findAll()[0].getName(), is("test name"));
    }

    /**
     * проверка метода удаления заявки
     */
    @Test
    public void whenshouDELETitems() {
        Tracker tracker = new Tracker();
        tracker.add(new Items("name", "desc"));
        Input input = new StubInput(new String[]{"3", tracker.findAll()[0].getId(), "6"});
        new StartUI(input, tracker).init();
        Items expected = null;
        assertThat(tracker.findAll()[0], is(expected));
    }

}