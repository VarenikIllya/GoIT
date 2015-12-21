package Module3.sub_1;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class TextFile extends File{
    private String s;
    private String title;

    TextFile(String path) throws IOException{
        super(path);

        s = path.substring(path.lastIndexOf('.') + 1);

        if (!s.toUpperCase().equals("TXT")) {
            throw new IOException("Provided file is not a Text '*.txt' file");
        }
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

    public String getTitle(){
        return title;
    }

    protected void setName(File file){
        this.renameTo(file);
    }

    protected void setTitle(String title){
        this.title = title;
    }
}
