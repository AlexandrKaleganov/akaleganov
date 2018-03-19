package ru.oop.bankomat;
/**
 * тест банкомат
 */

import org.junit.Test;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class BankomatTest {
    @Test
    public void bankamatTestirovanie(){
        int value = 25;
        int price = 35;
        int[] sdacha = new Bankomat().changes(value, price);
        for (int test:sdacha
             ) {
            if (test !=0){
                System.out.println(test);

            }

        }
    }

}