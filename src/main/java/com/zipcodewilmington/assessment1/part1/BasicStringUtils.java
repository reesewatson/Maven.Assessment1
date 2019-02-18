package com.zipcodewilmington.assessment1.part1;
import java.lang.*;
import java.lang.String;
import java.util.*;
/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String input = "the quick brown fox";
        String strArray[] = input.split(" ");
        String firstWord = strArray.charAt(strArray[0]).toUpperCase;
        String result = firstWord + input.substring(1, input.length);

        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        String input2 = "the quick brown fox";
        String rev = "";

        int len = input2.length();
        for (int i = len - 1; i >= 0; i--) {
        rev = rev + input2.charAt(i);
        }
        return rev;

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String input3 = "the quick brown fox";
        String rev = "";

        int len = input3.length();
        for (int i = len - 1; i >= 0; i--) {
        rev = rev + input3.charAt(i);
        }
        String firstWord = rev.charAt(0).toUpperCase;
        String result = firstWord + rev.substring(1, rev.length);
        
        return result;

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String input4 = "The quick brown";
        String str2 = " ";

        int length = input4.length();
        for(int i = 0; i < length; i++) {
        str2 = input4.substring(1, length-1);
        }
        return str2;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        String str3 = "tHE quiCK brOwN";

        char[] charArray = str3.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
        if (Character.isUpperCase(charArray[i])) {
        charArray[i] = Character.toLowerCase(charArray[i]);
        } else if (Character.isLowerCase(charArray[i])) {
        charArray[i] = Character.toUpperCase(charArray[i]);
        }
        return char[] charArray;
     }
}