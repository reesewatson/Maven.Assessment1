package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {

        int input = 5;
        int sum = 0;
        while (input > 0) {
            int add = input % 10;
            sum = sum + add;
            input = input / 10;
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {

        int product = 0;
        for (int i = 0; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

        int num = 12345;
        int rev = 0;

        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return rev;
    }
}