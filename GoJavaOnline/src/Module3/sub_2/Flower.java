package Module3.sub_2;

import java.util.Random;

public abstract class Flower {
    private String name, family;

    public String getName() {
        return name;
    }

    // Module6 subtask 1
    public void putOnTheGarden() throws NotSuchPlaceException{
        if (new Random().nextBoolean())
            throw new NotSuchPlaceException(this);
    }
}
