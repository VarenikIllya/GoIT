package Module3.sub_1;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class AudioFile extends File{
    private String s;
    private String author, genre;

    AudioFile(String path) throws IOException{
        super(path);
    }

    @Override
    public boolean isDirectory() {
        return super.isDirectory();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public long getSize() {
        return super.length();
    }

    public int getBitrate(){
        return (768 - new Random().nextInt(512)) * 1024;
    }

    protected void setName(File file){
        this.renameTo(file);
    }

    protected void setAttributes(String author, String genre){
        this.genre = genre;
        this.author = author;
    }


}
