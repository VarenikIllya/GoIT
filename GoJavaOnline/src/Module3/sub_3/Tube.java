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

    @Override
    public String getName() {
        return "Труба" + (!initialMessage.equals("")?" " + initialMessage:"");
    }

    @Override
    public String getType() {
        return "Духовые";
    }

    @Override
    protected void setName(String name) {
        System.out.print("Oops. You can't rename Tube");
    }

    @Override
    protected void setType(String name) {
        System.out.print("Oops. You can't re-set type for Tube");
    }
}
