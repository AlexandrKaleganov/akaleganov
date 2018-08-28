package ru.job4j.tictactoe;


public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {

        this.table = table;
    }

    public boolean isWinnerX() {
        boolean rsl = false;

        int gorizont = 0;
        int vertical = 0;
        int diaganalOne = 0;
        int diaganalTwo = 0;
        int index = table.length - 1;
        for (int i = 0; i < table.length; i++) {
            gorizont = 0;
            vertical = 0;
            if (table[i][index - 1].hasMarkX()) {
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
            if (gorizont == 3 ||  vertical == 3 ){
                rsl = true;
                break;
            }
            if (diaganalOne == 3|| diaganalTwo == 3) {
                rsl = true;
            }
        }
        return rsl;
    }
    public boolean isWinnerO() {
        return false;
    }

    public boolean hasGap() {
        return true;
    }
}
