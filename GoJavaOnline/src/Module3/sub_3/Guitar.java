package Module3.sub_3;

import java.util.Random;

/**
 * Created by i on 21.12.15.
 */
public class Guitar extends MusicInstrument{
    private String initialMessage;

    Guitar(){
        initialMessage = "";
    }
    Guitar(String initialMessage){
        this.initialMessage = initialMessage;
    }

    // Module6 subtask 2
    @Override
    void play(final String trackName) throws IllegalStateException {
        if (new Random().nextBoolean()){
            System.out.println("Guitar play '" + trackName + "'");
        } else{
            throw new IllegalStateException("Impossible play " + trackName + ". Guitar is broken");
        }

    }

    public String getName() {
        return "Гитара" + (!initialMessage.equals("")?" " + initialMessage:"");
    }


    public String getType() {
        return "Струнные";
    }

}
