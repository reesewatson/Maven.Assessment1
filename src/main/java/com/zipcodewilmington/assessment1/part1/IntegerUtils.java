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

        int sum = 0;
        while (0 <= n) {
            sum += 0;
            0++;
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

        while (val != 0) {
            reversedNum = reversedNum * 10 + val % 10;
            val = val / 10;

            return val;
    }
}
