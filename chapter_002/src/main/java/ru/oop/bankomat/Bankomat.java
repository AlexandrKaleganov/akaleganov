package ru.oop.bankomat;

/**
 * банкомат дающий сдачу
 */
public class Bankomat {

    public int[] changes(int value, int price) {
        int[] zdacha = new int[]{1, 2, 5, 10};
        int k = 0;
        try {
            k = value - price;
        } catch (Exception e) {
            e.printStackTrace();
        }
        int[] result = new int[30];
        int sdacha_result = 0;
        int j = 0;
        if (k > 0) {
            for (int i = zdacha.length - 1; i >= 0; i--) {
                while (k - (sdacha_result + zdacha[i]) >= 0) {
                    sdacha_result += zdacha[i];
                    result[j++] = zdacha[i];
                }
            }
        } else if (k < 0) {
            result[0] = value;
            System.out.println("недостаточно денег, заберите вашу купюру обратно");
        }
        return result;
    }

}
