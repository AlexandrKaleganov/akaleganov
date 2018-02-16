package ru.job4j.array;

/**
 * @author Alexandr Kaleganov
 * программа два отсортированных массива скидывает в один массив в порядке возрастания элементов
 * длинна цикла ar3.length-1 - чтоб не вывалиться за пределы массива
 * i+=2 - пойдём с шагом в два элемента, т.к. мы будем сразу два элемента запихивать в новый массив
 */
public class ArraysX2Sort {

    public static int[] ssortirovkaMassivavodin(int[]ar1, int[]ar2) {
        int[]ar3 = new int[ar1.length + ar2.length];
        int k = 0; //индекс первого массива
        int n = 0; // индекс второго массива
        for (int i = 0; i < ar3.length - 1; i += 2) {
            if (k < ar1.length - 1  && n < ar2.length - 1) {
                if (ar1[k] < ar2[n] && ar1[k + 1] <= ar2[n]) {
                    ar3[i] = ar1[k];
                    ar3[i + 1] = ar1[k + 1];
                    k += 2;
                    System.out.println(k + " (ar1[k] < ar2[n]&& ar1[k+1] <= ar2[n]) " + n);
                } else if (ar1[k] > ar2[n] && ar1[k] > ar2[n + 1]) {
                    ar3[i] = ar2[n];
                    ar3[i + 1] = ar2[n + 1];
                    n += 2;
                    System.out.println(k + " (ar1[k] > ar2[n]&& ar1[k] > ar2[n+1]) " + n);
                } else if (ar1[k] < ar2[n] && ar2[n] <= ar1[k + 1]) {
                ar3[i] = ar1[k];
                ar3[i + 1] = ar2[n];
                k++;
                n++;
                System.out.println(k + " (ar1[k] < ar2[n]&& ar2[n] <= ar1[k+1]) " + n);
                } else if (ar2[n] < ar1[k] && ar1[k] <= ar2[n + 1]) {
                    ar3[i] = ar2[n];
                    ar3[i + 1] = ar1[k];
                    k++;
                    n++;
                    System.out.println(k + " (ar2[n] < ar1[k]&& ar1[k] <= ar2[n+1]) " + n);
                } else if (ar1[k] == ar2[n]) {
                    ar3[i] = ar1[k];
                    ar3[i + 1] = ar2[n];
                    k++;
                    n++;
                    System.out.println(k + " (ar1[k] == ar2[n]) " + n);
                }
            } else if (k == ar1.length - 1  && n < ar2.length - 1) {  //если остался один элемент в 1 масиве
                System.out.println(k + " остался один элемент в массиве K " + n);
                if (ar1[k] <= ar2[n]) {
                    ar3[i] = ar1[k];
                    ar3[i + 1] = ar2[n];
                    k++;
                    n++;
                    System.out.println(k + " (ar1[k] <= ar2[n]) " + n + "ar3[i] + ar3[i+1] " + ar3[i] + " " + ar3[i + 1]);
                } else if (ar1[k] > ar2[n] && ar1[k] <= ar2[n + 1]) {
                    System.out.println(k + " выполнился код1" + n);
                    ar3[i] = ar2[n];
                    ar3[i + 1] = ar1[k];
                    k++;
                    n++;
                    System.out.println(k + " " + n);
                } else if (ar2[n] < ar1[k] && ar1[k] > ar2[n + 1]) {
                    System.out.println(k + " (ar2[n] < ar1[k] && ar1[k] > ar2[n + 1]) " + n);
                    ar3[i] = ar2[n];
                    ar3[i + 1] = ar2[n + 1];
                    n += 2;
                     System.out.println(k + " (ar2[n] < ar1[k] && ar1[k] > ar2[n + 1]) " + n);
                }
            } else if (k < ar1.length - 1 && n == ar2.length - 1) { //если остался один элемент в 2 масиве
                System.out.println(k + " остался один элемент в массиве n " + n);
                if (ar1[k] >= ar2[n]) {
                    ar3[i] = ar2[n];
                    ar3[i + 1] = ar1[k];
                    k++;
                    n++;
                    System.out.println(k + " " + n);
                } else if (ar1[k] < ar2[n] && ar2[n] <= ar1[k + 1]) {
                    System.out.println(k + " выполнился код5" + n);
                    ar3[i] = ar1[k];
                    ar3[i + 1] = ar2[n];
                    k++;
                    n++;
                    System.out.println(k + " " + n);
                } else if (ar1[k] < ar2[n] && ar2[n] > ar1[k + 1]) {
                    System.out.println(k + " выполнился код4" + n);
                    ar3[i] = ar1[k];
                    ar3[i + 1] = ar1[k + 1];
                    k += 2;
                    System.out.println(k + " " + n);

                }
            } else if (k >= ar1.length && n < ar2.length - 1) {
                System.out.println(k + " остались только элементы в пассиве n " + n);
                ar3[i] = ar2[n];
                ar3[i + 1] = ar2[n + 1];
            } else if (k < ar1.length - 1  && n >= ar2.length) {
                System.out.println(k + " остались только элементы в пассиве k " + n);
                ar3[i] = ar1[k];
                ar3[i + 1] = ar1[k + 1];
            }
        }
        return ar3;
    }
}
