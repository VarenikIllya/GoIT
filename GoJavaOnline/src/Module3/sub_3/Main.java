package Module3.sub_3;

/**
 * Created by i on 21.12.15.
 */
public class Main {
    public static void main(String[] args) {
        MusicStore store = new MusicStore(2);

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
