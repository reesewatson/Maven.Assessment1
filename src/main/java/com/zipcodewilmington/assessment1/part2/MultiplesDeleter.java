package com.zipcodewilmington.assessment1.part2;
import java.util.ArrayList;
/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <= ints.length; i++) {
            if (ints[i] % 2 == 0) {
                list.add([i]);
            }
        }
        return list.toArray(new String[list.size()]);

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <= ints.length; i++) {
            if (ints[i] % 2 == 1) {
                list.add(ints[i]);
            }
        }
        return list.toArray(new String[list.size()]);

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <= ints.length; i++) {
            if (ints[i] % 2 == 3) {
                list.add(ints[i]);
            }
        }
        return list.toArray(new String[list.size()]);

    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <= ints.length; i++) {
            if (ints[i] % 2 == n) {
                list.add(ints[i]);
            }
        }
        return list.toArray(new String[list.size()]);

    }
}
