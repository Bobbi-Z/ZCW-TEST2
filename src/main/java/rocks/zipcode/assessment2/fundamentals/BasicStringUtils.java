package rocks.zipcode.assessment2.fundamentals;

import org.apache.commons.lang3.*;
import org.apache.commons.lang3.StringUtils;

import java.util.List;


public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String combo = string1 + string2;
        return combo;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        string1 = StringUtils.reverse(string1);

        return string1;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        string1 = StringUtils.reverse(string1);
        string2 = StringUtils.reverse(string2);
        String combo = string1 + string2;

        return combo;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        char[] charsToRemove = charactersToRemove.toCharArray();
        char [] stringOfChar = string.toCharArray();

       for (char current : stringOfChar) {
           for (char element : charsToRemove) {
               if (current == element){
                   string = StringUtils.remove(string, current);
               }
           }

       }
        return string;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String newString = removeCharacters(string, charactersToRemove);
        newString = StringUtils.reverse(newString);
        return newString;
    }
}