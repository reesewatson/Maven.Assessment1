package com.zipcodewilmington.assessment1.part1;
import java.util.stream.*
/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

            int sum = IntStream.of(intArray[]).sum();

            return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {


            for (int i = 0; i < intArray.length; i++)

            return arrayProduct(intArray);
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

            int sum = 0;

            while(int i=0; i < intArray.length; i++)

            sum = sum + intArray[i];
            double getAverage = sum / intArray.length;;

            return getAverage;
    }
}
