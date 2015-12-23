package module5.sub_1;

/**
 * Created by i on 23.12.15.
 */
public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{0, 2, -24, 2, 100, 92};
        double[] doubleArray = new double[]{2.4, 2.1, -2.4, 20, 0.002, 92.3992};

        System.out.println(ArraysHelper.getMaxElement(intArray));
        System.out.println(ArraysHelper.getMinElement(intArray));
        System.out.println(ArraysHelper.getMinElement(doubleArray));
        System.out.println(ArraysHelper.getMaxElement(doubleArray));
    }
}
