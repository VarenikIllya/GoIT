package Module3.sub_1;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ImageFile extends File{
    private String s;
    private int r, g, b;

    ImageFile(String path) throws IOException{
        super(path);

        s = path.substring(path.lastIndexOf('.') + 1);

        if (!s.toUpperCase().equals("PNG")) {
            throw new IOException("Provided file is not an Image PNG file");
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

    public int getColorRate(){
        return (768 - new Random().nextInt(512)) * 1024;
    }

    protected void setName(File file){
        this.renameTo(file);
    }

    protected void setColorRate(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
