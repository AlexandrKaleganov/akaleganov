package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        return false;
    }

    public boolean isWinnerO() {
        return false;
    }

    public boolean hasGap() {
        boolean res = false;
        for (Figure3T krugOne[]:this.table) {
            for (Figure3T krugTwo:krugOne) {
                if (krugTwo.hasMarkO() == true || krugTwo.hasMarkX() == true){
                    res = true;
                } else if (krugTwo.hasMarkO() == true && krugTwo.hasMarkX() == true){
                    res = false;
                    break;
                }
            }

        }
        return res;
    }
}