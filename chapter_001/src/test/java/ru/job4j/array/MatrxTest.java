package ru.job4j.array;

/**
 * @author Alexander Kaleganov
 * @version 1.0
 * PS: это было проще чем отнять конфету у ребёнка)
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrxTest {
    @Test
    public void proverkaClassaMatrix() {
        int n = 5;
        int[][] multi = new Matrix().multiple(n);              //создали двухмерный массив, и заполнили его
        for (int i = 0; i < multi.length; i++) {               //вывовдим его в консоль чтобы посмотреть что получилось
            System.out.println(" ");                           //переход на новую строку
            for (int j = 0; j < multi.length; j++) {           //вывод строк
                System.out.print(multi[i][j]);
                if (multi[i][j] < 10) {                        //добавим услови , если значение меньше 10, то
                    System.out.print("   ");                   //добавим три пробела
                } else {                                       //иначе
                    System.out.print("  ");                    //добвим два пробела
                }
            }
        }
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}};
        assertThat(multi, is(expected));

    }
}
