package ru.job4j.forum;

/**
 * Timsort — гибридный алгоритм сортировки, сочетающий сортировку вставками и сортировку слиянием, опубликованный в 2002 году Тимом Петерсом[en].
 * Шаг 1. Входной массив разделяется на подмассивы фиксированной длины, вычисляемой определённым образом.
 * Шаг 2. Каждый подмассив сортируется сортировкой вставками, сортировкой пузырьком или любой другой устойчивой сортировкой.
 * Шаг 3. Отсортированные подмассивы объединяются в один массив с помощью модифицированной сортировки слиянием.
 */
public class Okeywki {
    private final int[] array = new int[32];
    private int[][] sortedMAss;
    private int[] arrayREuLT = new int[0];
    private int index = 0;

    public static void main(String[] args) {
        Okeywki okeywki = new Okeywki();
        okeywki.init();
        okeywki.sout();
    }

    //сгенерируем массив
    Okeywki() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = (int) Math.round((Math.random() * 32) - 16);
            System.out.print(array[i] + ", ");
        }
    }

    /**
     * Шаг 2. Каждый подмассив сортируется сортировкой вставками, сортировкой пузырьком или любой другой устойчивой сортировкой.
     *
     * @param mass
     */
    public void sort(int[][] mass) {
        //получим первоу отсортированную строчку
        this.arrayREuLT = this.sortBabl(this.sortedMAss[0]);
        for (int i = 1; i < mass.length; i++) {
            addResult(this.sortBabl(mass[i]));
        }
    }

    /**
     * Шаг 1. Входной массив разделяется на подмассивы фиксированной длины, вычисляемой определённым образом.
     */
    private void init() {
        int k = this.array.length / 4;
        this.sortedMAss = new int[4][k];
        for (int i = 0; i < sortedMAss.length; i++) {
            sortedMAss[i] = parseMass(k);
        }

        sort(this.sortedMAss);
    }

    //метод возвращает подмассивы
    private int[] parseMass(int k) {
        int[] rsl = new int[k];
        for (int j = 0; j < k; j++) {
            rsl[j] = array[index++];
        }
        return rsl;
    }

    /**
     * @param arr
     * @return
     */
    private int[] sortBabl(int[] arr) {
        Integer temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Шаг 3. Отсортированные подмассивы объединяются в один массив с помощью модифицированной сортировки слиянием.
     *
     * @param mass
     */
    private void addResult(int[] mass) {
        int[] temp = new int[this.arrayREuLT.length + mass.length];
        int n = 0;
        int i = 0;
        int j = 0;
        while (n < temp.length) {
            if (j < mass.length && i < arrayREuLT.length) {
                if (mass[j] < arrayREuLT[i]) {
                    temp[n++] = mass[j++];
                } else if (mass[j] > arrayREuLT[i]) {
                    temp[n++] = arrayREuLT[i++];
                } else if (mass[j] == arrayREuLT[i]) {
                    temp[n++] = mass[j++];
                    temp[n++] = arrayREuLT[i++];
                }
            } else if (j >= mass.length) {
                temp[n++] = arrayREuLT[i++];
            } else {
                temp[n++] = mass[j++];
            }
        }
        this.arrayREuLT = temp;
    }


    public void sout() {
        for (int i = 0; i < this.arrayREuLT.length; i++) {
            System.out.println(this.arrayREuLT[i]);
        }
    }
}
