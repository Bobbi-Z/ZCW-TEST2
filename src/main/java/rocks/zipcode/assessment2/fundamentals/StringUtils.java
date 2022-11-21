package rocks.zipcode.assessment2.fundamentals;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String newString = String.format("%" + (amountOfPadding) + "s", stringToBePadded);
        return newString;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String newString = String.format("%" + (-amountOfPadding) + "s", stringToBePadded);
        return newString;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String newString = org.apache.commons.lang3.StringUtils.repeat(stringToBeRepeated, numberOfTimeToRepeat);
        return newString;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
      Boolean results = org.apache.commons.lang3.StringUtils.isAlphaSpace(string);

        return results;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        Boolean results = org.apache.commons.lang3.StringUtils.isNumericSpace(string);
        return results;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        Boolean outcome = org.apache.commons.lang3.StringUtils.containsOnly(string, "-/@#!*$%^&.'_+={}()");

        return outcome;
    }
}
