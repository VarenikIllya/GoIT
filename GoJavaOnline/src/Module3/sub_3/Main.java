package Module3.sub_3;

import java.util.*;

/**
 * Created by i on 21.12.15.
 */
public class Main {
    public static void main(String[] args) {
        List<Guitar> guitars = new ArrayList<Guitar>();
        List<Piano> pianos = new ArrayList<Piano>();
        List<Tube> tubes = new ArrayList<Tube>();

        for (int i = 1; i < 3; i++) {
            guitars.add(new Guitar());
            tubes.add(new Tube());
            pianos.add(new Piano());
        }

        MusicStore store = new MusicStore(pianos, guitars, tubes);

        for (int i = 1; i < 4; i++)
            System.out.println(store.buyGuitar().getName());

        for (int i = 1; i <= 1; i++) {
            System.out.println(store.buyPiano().getName());
        }

        for (int i = 1; i <= 2; i++) {
            System.out.println(store.buyTube().getName());
        }
    }
}
