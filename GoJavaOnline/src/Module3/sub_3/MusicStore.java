package Module3.sub_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i on 21.12.15.
 */
public class MusicStore {
    List<Guitar> guitarList;
    List<Piano> pianoList;
    List<Tube> tubeList;

    MusicStore(List<Piano> piano, List<Guitar> guitar, List<Tube> tube){
        this.guitarList = guitar;
        this.pianoList = piano;
        this.tubeList = tube;
    }

    public Guitar buyGuitar(){
        if (!guitarList.isEmpty()) {
            return guitarList.remove(0);
        } else{
            return new Guitar("Будет доступка к отгрузке через 2 недели");
        }
    }

    public Piano buyPiano(){
        if (!pianoList.isEmpty()) {
            return pianoList.remove(0);
        } else{
            return new Piano("Будет доступка к отгрузке через 2 недели");
        }
    }

    public Tube buyTube(){
        if (!tubeList.isEmpty()) {
            return tubeList.remove(0);
        } else{
            return new Tube("Будет доступка к отгрузке через 2 недели");
        }
    }
}
