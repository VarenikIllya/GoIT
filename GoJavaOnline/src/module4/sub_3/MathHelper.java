package module4.sub_3;

/**
 * Created by i on 21.12.15.
 */
public class MathHelper {
    public static double calcLenghtBetweenTwoDots(Dot dot1, Dot dot2){
        return calcLenghtBetweenTwoDots(dot1.getX(), dot1.getY(), dot2.getX(), dot2.getY());
    }

    public static double calcLenghtBetweenTwoDots(int dot1_x, int dot1_y, int dot2_x, int dot2_y){
        return Math.sqrt(Math.pow(dot1_x - dot2_x,2) + Math.pow(dot1_y - dot2_y, 2));
    }
}
