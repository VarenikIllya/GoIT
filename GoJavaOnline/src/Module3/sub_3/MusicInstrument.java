package Module3.sub_3;

/**
 * Created by i on 21.12.15.
 */
public abstract class MusicInstrument {
    private String type, name;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setType(String type) {
        this.type = type;
    }

    abstract void play();
}
