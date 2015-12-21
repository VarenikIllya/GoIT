package module4.sub_3;

/**
 * Created by i on 21.12.15.
 */
public class Main {
    public static void main(String[] args) {
        Dot d1 = new Dot(-2, 4),
            d2 = new Dot(3, -5);

        System.out.println(MathHelper.calcLenghtBetweenTwoDots(d1,d2));
    }
}
