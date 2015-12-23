package Module3.sub_2;

import java.util.Random;

public abstract class Flower {
    private String name, family;

    public String getName() {
        return name;
    }

    public void putOnTheGarden() throws NotSuchPlaceException{
        if (new Random().nextBoolean())
            throw new NotSuchPlaceException(this);
    }
}
