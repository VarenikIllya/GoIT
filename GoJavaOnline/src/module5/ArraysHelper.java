package module5;


import java.util.Arrays;

/**
 * Created by i on 23.12.15.
 */
public class ArraysHelper {

    public static int getMaxElement(int[] array) {
        sortArray(array);
        return array[array.length - 1];
    }

    public static int getMinElement(int[] array) {
        sortArray(array);
        return array[0];
    }

    /**
     * Sort via "insertion method"
     */
    public static void sortArray(int[] intArray) {
        int element;
        for (int i = 1; i < intArray.length; i++) {
            element = intArray[i];
            int j = i;
            while (j > 0 && intArray[j - 1] > element) {
                intArray[j] = intArray[j - 1];
                j--;
            }
            intArray[j] = element;
        }
    }

}
