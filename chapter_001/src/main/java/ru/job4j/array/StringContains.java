package ru.job4j.array;

/**
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
        int k =0;
        char[]origin1 = origin.toCharArray();
        System.out.println(origin1);
        char[]sub1 = sub.toCharArray();
        System.out.println(sub1);
        for (int i = 0; i < (origin1.length - sub1.length); i++) {
            if (sub1[0] != origin1[i]) {
                continue;
            } else {
                for (int j = 0; j < sub1.length; j++) {
                    if (sub1[j] == origin1[i + j]) {
                        result =  true;

                        System.out.println(result);
                        break;
                    } else {
                        result = false;
                        System.out.println(result);
                    }
                }
            }
        }
        return result;
    }
}
