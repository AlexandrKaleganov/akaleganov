package ru.job4j.tictactoe;

/**
 * @author Alexander Kaleganov
 * @since 28.08.2018
 *
 * методы реализовал без формул в один проход по матрице,
 */
public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {

        this.table = table;
    }

    /**
     * проверяет выигрышное положение крестика
     *
     * @return
     */
    public boolean isWinnerX() {
        boolean rsl = false;

        int gorizont;
        int vertical;
        int diaganalOne = 0;
        int diaganalTwo = 0;

        int index = table.length - 1;         //индекс для хода по диаганали с права на лево

        for (int i = 0; i < table.length; i++) {
            gorizont = 0;
            vertical = 0;
            if (table[i][index--].hasMarkX()) {
                diaganalTwo++;
            }
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j].hasMarkX()) {
                    gorizont++;
                    if (i == j) {
                        diaganalOne++;
                    }
                }
                if (table[j][i].hasMarkX()) {
                    vertical++;
                }
            }
            if (gorizont == table.length || vertical == table.length) {
                rsl = true;
                break;
            }
            if (diaganalOne == table.length || diaganalTwo == table.length) {
                rsl = true;
            }
        }
        return rsl;
    }

    /**
     * проверяет выигрышное положение нолики
     * @return
     */
    public boolean isWinnerO() {
        boolean rsl = false;

        int gorizont;
        int vertical;
        int diaganalOne = 0;
        int diaganalTwo = 0;

        int index = table.length - 1;         //индекс для хода по диаганали с права на лево

        for (int i = 0; i < table.length; i++) {
            gorizont = 0;
            vertical = 0;
            if (table[i][index--].hasMarkO()) {
                diaganalTwo++;
            }
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j].hasMarkO()) {
                    gorizont++;
                    if (i == j) {
                        diaganalOne++;
                    }
                }
                if (table[j][i].hasMarkO()) {
                    vertical++;
                }
            }
            if (gorizont == 3 || vertical == 3) {
                rsl = true;
                break;
            }
            if (diaganalOne == 3 || diaganalTwo == 3) {
                rsl = true;
            }
        }
        return rsl;
    }

    /**
     * проверяет есть ли пустые ходы
     *
     * @return
     */
    public boolean hasGap() {
        boolean rsl = false;
        for (int i = 0; i < this.table.length; i++) {
            for (int i1 = 0; i1 < this.table[i].length; i1++) {
                if (!table[i][i1].hasMarkO() && !table[i][i1].hasMarkX()) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }
}
