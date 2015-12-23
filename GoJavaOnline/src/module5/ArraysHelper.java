package module5;


import java.util.Arrays;

/**
 * Created by i on 23.12.15.
 */
public class ArraysHelper {

    public static int getMaxElement(int[] array){
        // Hack
        Arrays.sort(array);
        return array[array.length-1];
    }

    public static double getMaxElement(double[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    public static int getMinElement(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    public static double getMinElement(double[] array){
        Arrays.sort(array);
        return array[0];
    }
}
