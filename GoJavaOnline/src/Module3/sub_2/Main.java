package Module3.sub_2;

/**
 * Created by i on 21.12.15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Rose().getName());
        System.out.println(new Aster().getName());
        System.out.println(new Chamomile().getName());


        System.out.println(new Rosebush(0).getFullName());
        System.out.println(new Tulip().getName());

        Bouquet bouquet = new Bouquet("Букет",  new Flower[]{new Rose(), new Rose(), new Rose()});

        System.out.println("В букете '" + bouquet + "' " + bouquet.getFlowersCount() + " цветка");
    }
}
