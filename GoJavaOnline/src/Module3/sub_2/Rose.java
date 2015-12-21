package Module3.sub_2;

/**
 * Created by i on 21.12.15.
 */
public class Rose extends Flower {
    private static String NAME="Rose", FAMILY="Flowers";

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
