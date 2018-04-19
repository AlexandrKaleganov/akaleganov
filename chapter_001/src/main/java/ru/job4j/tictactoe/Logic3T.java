package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean res = false;
        int diaganal = 0;
        int vertikal = 0;
        int gorizontal = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i][0].hasMarkX() == true) {
                vertikal++;
            }
            if (table[i][i].hasMarkX() == true) {
                diaganal++;
            }
            if (gorizontal == 3 || vertikal == 3 || diaganal == 3) {
                res = true;
                break;
            }
            for (int j = 0; j < table[i].length; j++) {

                if (table[i][j].hasMarkX() == true) {
                    gorizontal++;
                } else if (table[i][j].hasMarkX() == false) {
                    gorizontal = 0;
                }
            }

        }
        return res;
    }

    public boolean isWinnerO() {
        boolean res = false;
        int diaganal = 0;
        int vertikal = 0;
        int gorizontal = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i][0].hasMarkO() == true) {
                vertikal++;
            }
            if (table[i][i].hasMarkO() == true) {
                diaganal++;
            }
            if (gorizontal == 3 || vertikal == 3 || diaganal == 3) {
                res = true;
                break;
            }
            for (int j = 0; j < table[i].length; j++) {

                if (table[i][j].hasMarkO() == true) {
                    gorizontal++;
                } else if (table[i][j].hasMarkO() == false) {
                    gorizontal = 0;
                }
            }

        }
        return res;
    }

    public boolean hasGap() {
        boolean res = false;
        for (Figure3T krugOne[] : this.table) {
            for (Figure3T krugTwo : krugOne) {
                if (krugTwo.hasMarkO() == true || krugTwo.hasMarkX() == true) {
                    res = true;
                } else if (krugTwo.hasMarkO() == true && krugTwo.hasMarkX() == true) {
                    res = false;
                    break;
                }
            }

        }
        return res;
    }
}