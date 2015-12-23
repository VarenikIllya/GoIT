package Module3.sub_2;


import java.util.List;

/**
 * Created by i on 21.12.15.
 */
public class Bouquet {
    private List<Flower> flowers;
    private String name;

    Bouquet( String name, List<Flower> flowers){
        this.flowers = flowers;
        this.name = name;
    }


    Bouquet(final List<Flower> flowers){
        this.flowers = flowers;
        boolean isOneTypeFlower = true;

        if (flowers != null) {

            Flower flower = flowers.get(0);

            for(Flower f : flowers){
                if(isOneTypeFlower){
                    isOneTypeFlower=flower.getName() == f.getName();
                } else{
                    this.name = "Букет";
                    break;
                }
            }
        }
        System.out.println(flowers.get(0).getName());
        if (isOneTypeFlower) {
            this.name = "Букет " + flowers.get(0).getName();
        }
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getFlowersCount() {
        return flowers.size();
    }

    @Override
    public String toString() {
        return getName();
    }
}
