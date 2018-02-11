package ru.job4j.array;

/**
 * программа будет сравнивать две входящие строки
 * и возвращать значение булеан по завершению работы
 * задача заставляет получить массив символов, также можно было обойтись запросом в подстроку субстринг и сравнить элементы
 * @author Alexander Kaleganov
 * @since 10.02.2018
 */
public class StringContains {

    /**
     * @param origin
     * @param sub
     * @return
     */

    public boolean stringContainsValid(String origin, String sub) {
        boolean result = false;

        char[]origin1 = origin.toCharArray();
        char[]sub1 = sub.toCharArray();
        for (int i = 0; i < (origin1.length - sub1.length); i++) {
            if (sub1[0] == origin1[i]) {
                for (int j = 0; j < sub1.length; j++) {
                    if (sub1[j] == origin1[i + j]) {
                        result =  true;
                    } else {
                        result = false;
                    }
                }
            } else {
                continue;
            }
        }
        return result;
    }
}
