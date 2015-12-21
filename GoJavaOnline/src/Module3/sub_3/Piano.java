package Module3.sub_3;

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
    void play() {
        System.out.print("Играет музыка Шопена");
    }

    public String getName() {
        return "Рояль" + (!initialMessage.equals("")?" " + initialMessage:"");
    }

    public String getType() {
        return "Клавишные";
    }
}
