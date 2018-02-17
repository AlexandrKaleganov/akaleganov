package ru.job4j.arr2;

/**
 * я сёдня подумал что если мы заранее значем чем закончится массив,
 * то мы можем заранее знать с чего он начнётся, и вернулся к первоначальному решению
 * даже боялся лишние строки писать ))
 */
public class Mass2in1 {

    public static int[] ssortirovkaMassivavodin(int[]ar1, int[]ar2) {
        int[]ar3 = new int[ar1.length + ar2.length];
        int k = 0;
        int n = 0;
        ar3[0] = ar1[0] < ar2[0] ? ar1[0] : ar2[0];
        for (int i = 0; i < ar3.length; i++) {
            if (k < ar1.length && n < ar2.length) {
                if (ar3[i] <= ar1[k] && ar1[k] <= ar2[n]) {
                    ar3[i] = ar1[k];
                    k++;
                } else {
                    ar3[i] = ar2[n];
                    n++;
                }
            } else if (k < ar1.length && n >= ar2.length) {
                ar3[i] = ar1[k];
                k++;
            } else if (n < ar2.length && k >= ar1.length) {
                ar3[i] = ar2[n];
                n++;
            }
        } return ar3;
    }
}
