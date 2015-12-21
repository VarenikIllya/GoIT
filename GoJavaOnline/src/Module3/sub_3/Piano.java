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

    @Override
    public String getName() {
        return "Рояль" + (!initialMessage.equals("")?" " + initialMessage:"");
    }

    @Override
    public String getType() {
        return "Клавишные";
    }

    @Override
    protected void setName(String name) {
        System.out.print("Oops. You can't rename Piano");
    }

    @Override
    protected void setType(String name) {
        System.out.print("Oops. You can't re-set type for Piano");
    }
}
