package Module3.sub_2;


/**
 * Created by i on 21.12.15.
 */
public class Bouquet {
    private Flower[] flowers;
    private String name;

    Bouquet( String name, Flower[] flowers){
        this.flowers = flowers;
        this.name = name;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getFlowersCount() {
        return flowers.length;
    }

    @Override
    public String toString() {
        return getName();
    }
}
