package com.zipcodewilmington.assessment1.part1;
import java.lang.*;
import java.lang.StringBuilder;
/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        StringBuilder value = new StringBuilder()
                .append(value.substring(0, 1).toUpperCase())
                .append(value.substring(1))
                .toString();

        return value;

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        StringBuilder builder = new StringBuilder(str);
        String result = builder.reverse().toString();
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {


        StringBuffer res = new StringBuffer();

        String[] strArr = str.split(" ");
        for (String str : strArr) {
            char[] stringArray = str.trim().toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);
            str = new String(stringArray);

            res.append(str).append(" ");
            }

            return res.toString().trim());

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str) {
                result = result + str.charAt(i);
                if(str.charAt(str.length-1) != str) {
                    result = result + str.charAt(str.length-1);
                }
            }
        }
        return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
    }

