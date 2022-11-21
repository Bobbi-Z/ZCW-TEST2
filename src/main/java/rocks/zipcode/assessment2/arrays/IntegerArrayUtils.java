package rocks.zipcode.assessment2.arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {

           integerArray = ArrayUtils.add(integerArray, valueToBeAdded);
           return integerArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        integerArray = ArrayUtils.remove(integerArray, indexToInsertAt);
        integerArray = ArrayUtils.insert(indexToInsertAt, integerArray, valueToBeInserted);
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {

        int indexElement = ArrayUtils.get(integerArray, indexToFetch);
        return indexElement;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
      Integer [] newIntArray = new Integer[0];

        for (Integer current : integerArray){
            if (current % 2 == 0){
                newIntArray = ArrayUtils.add(newIntArray, current +1);

            }else if (current % 2 != 0){
                newIntArray = ArrayUtils.add(newIntArray, current -1);
            }
        }
        return newIntArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer [] newIntArray = new Integer[0];

        for (Integer current : integerArray){
            if (current % 2 == 0){
                newIntArray = ArrayUtils.add(newIntArray, current +1);

            }else {
                newIntArray = ArrayUtils.add(newIntArray, current );
            }
        }
        return newIntArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer [] newIntArray = new Integer[0];

        for (Integer current : input){
            if (current % 2 == 0){
                newIntArray = ArrayUtils.add(newIntArray, current );

            }else if (current % 2 != 0){
                newIntArray = ArrayUtils.add(newIntArray, current -1);
            }
        }
        return newIntArray;
    }
}
