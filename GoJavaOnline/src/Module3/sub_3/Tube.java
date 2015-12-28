package Module3.sub_3;

import java.util.Random;

/**
 * Created by i on 21.12.15.
 */
public class Tube extends MusicInstrument{
    private String initialMessage;

    Tube(){
        initialMessage = "";
    }
    Tube(String initialMessage){
        this.initialMessage = initialMessage;
    }
    @Override
    void play(String trackName) {
        if (new Random().nextBoolean()){
            System.out.println("Tube play '" + trackName + "'");
        } else{
            throw new IllegalStateException("Impossible play " + trackName + ". Tube is broken");
        }
    }

    public String getName() {
        return "Труба" + (!initialMessage.equals("")?" " + initialMessage:"");
    }

    public String getType() {
        return "Духовые";
    }

}
