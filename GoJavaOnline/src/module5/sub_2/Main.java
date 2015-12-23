package module5.sub_2;

import module5.ArraysHelper;

/**
 * Created by i on 23.12.15.
 */
public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[]{-21, 0, -24, 23, 12, 99, 100, -4, 8};

        ArraysHelper helper = new ArraysHelper(intArray);

        helper.printAllElements();
        helper.sortArray();
        helper.printAllElements();
    }
}
