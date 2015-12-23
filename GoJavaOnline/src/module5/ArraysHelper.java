package module5;


import java.util.Arrays;

/**
 * Created by i on 23.12.15.
 */
public class ArraysHelper {
    private int[] intArray;
    private double[] doubleArray;

    public ArraysHelper(int[] intArray){
        this.intArray = intArray;
    }

    public ArraysHelper(double[] doubleArray){
        this.doubleArray = doubleArray;
    }

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


    public Number getMaxElement(){
        return intArray != null ? intArray[intArray.length - 1] : doubleArray[doubleArray.length - 1];
    }

    public Number getMinElement(){
        return intArray != null ? intArray[0] : doubleArray[0];
    }


    public void printAllElements(){
        if (intArray != null){
            for (int element : intArray){
                System.out.print(element + " ");
            }
        } else{
            for (double element : doubleArray){
                System.out.println(element + " ");
            }
        }
        System.out.println();
    }

    /**
     * Sort via "insertion method"
     */
    public void sortArray(){
        int element;
        for (int i = 1; i < intArray.length; i++){
            element = intArray[i];
            int j = i;
//            System.out.println("i=" + i + ", j=" + j + ", element=" + element);
            for (; j > 0 && intArray[j-1] > element; j--){
                intArray[j] = intArray[j-1];
            }
            intArray[j] = element;
//            printAllElements();
        }
    }

    private void swipeElement(int[] intArray, int fromIndex, int toIndex){
        int tempElement = intArray[fromIndex];
        intArray[fromIndex] = intArray[toIndex];
        intArray[toIndex] = tempElement;
    }
}
