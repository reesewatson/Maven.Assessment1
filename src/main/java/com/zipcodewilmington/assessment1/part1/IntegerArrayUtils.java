package com.zipcodewilmington.assessment1.part1;
import java.util.stream.*;
/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

            int input[] = {1, 2, 3, 4, 5};
            int sum = 0;

            for (int i = 0; i < input.length; i++) {
                sum += input[i];
                }
            return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {

            int product = 1;
            for (int i: intArray){
                product *= i;
            }
            return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

            int input[] = {1, 2, 3, 4, 5};
            int sum = 0;

            for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
            double avg = sum / input.length;
            return avg;
    }
}
