package rocks.zipcode.assessment2.arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex)  {
        String [] subArray = ArrayUtils.subarray(arrayToBeSpliced, startingIndex,endingIndex);
        if (startingIndex > arrayToBeSpliced.length || endingIndex > arrayToBeSpliced.length ) {
            throw new IndexOutOfBoundsException();
        }else if (startingIndex < 0 || endingIndex < 0){
            throw new IllegalArgumentException();
        }
        return subArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        String [] subArray = ArrayUtils.subarray(arrayToBeSpliced, startingIndex, arrayToBeSpliced.length);
        if (startingIndex > arrayToBeSpliced.length) {
            throw new IllegalArgumentException();
        }else if (startingIndex < 0){
            throw new IndexOutOfBoundsException();
        }
        return subArray;
    }
}
