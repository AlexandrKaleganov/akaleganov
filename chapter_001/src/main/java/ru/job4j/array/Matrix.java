package ru.job4j.array;
/**
 * Матрица таблица умножения
 * @author Alexander Kaleganov
 * @version 1.0
 * @since 05.02.2018
 */
public class Matrix {
    public int[][] multiple(int size) { //получаем размер матрицы
        int[][]result = new int[size][size]; // передаём это значение в двухмерный массив
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = (i + 1) * (j + 1);
                /**
                 * добавляем 1, я так понял не сами индексы необходимо перемножить,
                 * а чтоб получалась таблица умножения без умножения на ноль
                 */
            }
        }
        return result;
    }
}
