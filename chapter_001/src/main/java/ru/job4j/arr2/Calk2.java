package ru.job4j.arr2;

public class Calk2 {
    public static double kkkalCullator(String primer) {
        double result = 0;
        String[] operator = new String[]{"+", "-", "*", "/"};
        String[] strprimer = new String[primer.length()];
        for (int i = 0; i < primer.length(); i++) {
            strprimer[i] = primer.substring(i, i + 1);
        }
        for (int j = 0; j < primer.length(); j++) {
            if (operator[0].equals(strprimer[j])) {
                double x = Double.valueOf(strprimer[j - 1]);
                double y = Double.valueOf(strprimer[j + 1]);
                result = x + y;
            } else if (operator[1].equals(strprimer[j])) {
                double x = Double.valueOf(primer.substring(j - 1));
                double y = Double.valueOf(primer.substring(j + 1));
                result = x - y;
            } else if (operator[2].equals(strprimer[j])) {
                double x = Double.valueOf(primer.substring(j - 1));
                double y = Double.valueOf(primer.substring(j + 1));
                result = x * y;
            } else if (operator[3].equals(strprimer[j])) {
                double x = Double.valueOf(primer.substring(j - 1));
                double y = Double.valueOf(primer.substring(j + 1));
                result = x / y;
            }
        } return result;
    }
}
