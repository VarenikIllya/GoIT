package Module3.sub_1;

import java.io.IOException;
import java.util.Random;

public class AudioFile extends File{
    private String s;
    private String author, genre;

    AudioFile(String path) throws IOException{
        super(path);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getBitrate(){
        return (768 - new Random().nextInt(512)) * 1024;
    }

    protected void setAttributes(String author, String genre){
        this.genre = genre;
        this.author = author;
    }


}
