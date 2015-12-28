package Module3.sub_3;

import java.util.Random;

/**
 * Created by i on 21.12.15.
 */
public class Piano extends MusicInstrument{
    private String initialMessage;

    Piano(){
        initialMessage = "";
    }
    Piano(String initialMessage){
        this.initialMessage = initialMessage;
    }
    @Override
    void play(String trackName) {
        if (new Random().nextBoolean()){
            System.out.println("Piano play + '" + trackName + "'");
        } else{
            throw new IllegalStateException("Impossible play " + trackName + ". Tube is broken");
        }
    }

    public String getName() {
        return "Рояль" + (!initialMessage.equals("")?" " + initialMessage:"");
    }

    public String getType() {
        return "Клавишные";
    }
}
