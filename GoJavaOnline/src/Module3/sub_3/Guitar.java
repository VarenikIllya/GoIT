package Module3.sub_3;

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

    @Override
    void play() {
        System.out.print("Играет гитарная партия 'Muse - Dead inside'");
    }

    @Override
    public String getName() {
        return "Гитара" + (!initialMessage.equals("")?" " + initialMessage:"");
    }

    @Override
    public String getType() {
        return "Струнные";
    }

    @Override
    protected void setName(String name) {
        System.out.print("Oops. You can't rename Guitar");
    }

    @Override
    protected void setType(String name) {
        System.out.print("Oops. You can't re-set type for Guitar");
    }
}
