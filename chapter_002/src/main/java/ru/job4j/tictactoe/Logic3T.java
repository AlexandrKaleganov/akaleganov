package ru.job4j.tictactoe;


public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {

        this.table = table;
    }

    public boolean isWinnerX() {
        boolean rsl = false;
        boolean isflagHorizont = false;
        boolean isflagVertikal = false;
        boolean isflagDiagonalLeft = false;
        boolean isflagDiagonalRair = false;
int gorizont = 0;
int vertical;
int diaganalOne = 0;
int diaganalTwo;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j].hasMarkX()) {

                }
                 if (i == j) {
                     diaganalOne++;
                 }
                }
            if (gorizont == 3 ){
                rsl = true;
                break;
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
