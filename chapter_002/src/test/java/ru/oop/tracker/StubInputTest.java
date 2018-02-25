package ru.oop.tracker;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import org.junit.Test;
import ru.oop.tracker.modules.Tracker;
import ru.oop.tracker.modules.Items;

import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StubInputTest {

    /**
     * тест добавления заявки
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     * тестирование вывода списка всех заявок
     * не знаю как проверить но мы просто видим что при вызове команды в консоль выводится список наших заявок
     */
    @Test
    public void whenshouAllTrackshouall() {
        Tracker tracker = new Tracker();
        tracker.add(new Items("name", "desc"));
        tracker.add(new Items("name2", "desc2"));
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
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

    /**
     * тестирование вывода в консоль заявки по id
     * не знаю как сравнить значения выводимые в консоль с ожидаемым
     */
    @Test
    public void whenFindbyIDitems() {
        Tracker tracker = new Tracker();
        tracker.add(new Items("name", "desc"));
        tracker.add(new Items("name2", "desc2"));
        Input input = new StubInput(new String[]{"4", tracker.findAll()[1].getId(), "6"});
        new  StartUI(input, tracker).init();
    }

    /**
     * тестирование вывода в консоль заявк по имени
     * не знаю как сравнить значения выводимые в консоль с ожидаемым
     */
    @Test
    public void whenFindbyNAMEitems() {
        Tracker tracker = new Tracker();
        tracker.add(new Items("name", "desc"));
        tracker.add(new Items("name2", "desc2"));
        Input input = new StubInput(new String[]{"5", tracker.findAll()[1].getName(), "6"});
        new StartUI(input, tracker).init();

    }
}