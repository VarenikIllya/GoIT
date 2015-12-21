package Module3.sub_2;

/**
 * Created by i on 21.12.15.
 */
public class Tulip extends Flower {
    private static String NAME="Tulip", FAMILY="Flowers";

    @Override
    public String getFamily() {
        return FAMILY;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    protected void setFamily() {
        System.out.print("Cant set Family");
    }

    @Override
    protected void setName() {
        System.out.print("Cant set Name");
    }
}
