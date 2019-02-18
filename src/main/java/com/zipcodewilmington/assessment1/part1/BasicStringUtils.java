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

        String str = "the quick brown fox";
        String strArray[] = str.split(" ");
        String firstWord = strArray.charAt(strArray[0]).toUpperCase;
        String result = firstWord + str.substring(1, str.length);

        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        String input = "the quick brown fox";
        String rev = "";

        int len = input.length();
        for (int i = len - 1; i >= 0; i--) {
        rev = rev + input.charAt(i);
        }
        return rev;

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String input = "the quick brown fox";
        String rev = "";

        int len = input.length();
        for (int i = len - 1; i >= 0; i--) {
        rev = rev + input.charAt(i);
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
        String input = "The quick brown";
        String str = " ";

        int length = input.length();
        for(int i = 0; i < length; i++) {
        str = input.substring(1, length-1);
        }
        return str;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

         String input = "tHE quiCK brOwN";

         int len = input.length();
         for (int i = 0; i < len; i++) {
         Character a = input.charAt(i);

         if (Character.isLowerCase(a))
         input.replace(i, i + 1, Character.toUpperCase(a) + ""); {

         else {
         input.replace(i, i + 1, Character.toLowerCase(a) + "");
        
        }
        return input;
    }

