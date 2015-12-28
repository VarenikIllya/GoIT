package module5.sub_2;

import module5.ArraysHelper;

import java.util.Arrays;

/**
 * Created by i on 23.12.15.
 */
public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[]{-21, 0, -24, 23, 12, 99, 100, -4, 8};

        System.out.println(Arrays.toString(intArray));
        ArraysHelper.sortArray(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
