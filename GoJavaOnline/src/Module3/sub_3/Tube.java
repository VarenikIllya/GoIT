package Module3.sub_3;

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
    void play() {
        System.out.print("Играет музыка Ивана");
    }

    public String getName() {
        return "Труба" + (!initialMessage.equals("")?" " + initialMessage:"");
    }

    public String getType() {
        return "Духовые";
    }

}
