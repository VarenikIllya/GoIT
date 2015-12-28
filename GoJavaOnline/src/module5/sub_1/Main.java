package module5.sub_1;

import module5.ArraysHelper;

import java.util.Arrays;

/**
 * Created by i on 23.12.15.
 */
public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{0, 2, -24, 2, 100, 92};

        System.out.println(Arrays.toString(intArray));
        System.out.println("Max element: " + ArraysHelper.getMaxElement(intArray));
        System.out.println("Min element: " + ArraysHelper.getMinElement(intArray));

    }
}
