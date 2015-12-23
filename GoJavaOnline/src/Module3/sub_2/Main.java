package Module3.sub_2;

import com.sun.tools.javac.comp.Flow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i on 21.12.15.
 */
public class Main {
    public static void main(String[] args) {
        List<Flower> flowers = new ArrayList<Flower>();
        System.out.println(new Rose().getName());
        System.out.println(new Aster().getName());
        System.out.println(new Chamomile().getName());

        for (int i = 1; i <=3; i++)
            flowers.add(new Rose());

        System.out.println(new Rosebush(0).getFullName());
        System.out.println(new Tulip().getName());

        Bouquet bouquet = new Bouquet(flowers);

        System.out.println("В букете '" + bouquet + "' " + bouquet.getFlowersCount() + " цветка");
    }
}
