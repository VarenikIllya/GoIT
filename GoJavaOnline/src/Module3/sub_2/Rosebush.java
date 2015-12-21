package Module3.sub_2;

/**
 * Created by i on 21.12.15.
 */
public class Rosebush extends Flower {
    private static String NAME="Rosebush", FAMILY="Flowers";
    private int countOfRose;

    Rosebush(int countOfRose){

        this.countOfRose = countOfRose>0?countOfRose:0;
    }


    public String getFamily() {
        return FAMILY;
    }


    public String getName() {
        return NAME;
    }

    public int getCountOfRose(){
        return countOfRose;
    }

    public String getFullName(){
        return NAME + (countOfRose>0?", count of roses is " + countOfRose:"");
    }


}
